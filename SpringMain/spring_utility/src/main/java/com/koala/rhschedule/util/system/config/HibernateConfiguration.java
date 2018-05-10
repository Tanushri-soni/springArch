package com.koala.rhschedule.util.system.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.koala.rhschedule.util.property.reader.PropertyReader;
import com.spring.constants.CommonConstants;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * 
 * Hibernate Configuration class using property file
 * 
 *
 */
@Configuration
public class HibernateConfiguration {

	@Autowired
	@Qualifier(CommonConstants.SYSTEM_PROPERTY_READER)
	private PropertyReader systemPropertyReader;

	private DataSource datasource;

	/**
	 * Generate Session Factory Bean with database configuration
	 * 
	 * @return
	 */
	@Bean
	public LocalSessionFactoryBean sessionFactory() {

		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] { CommonConstants.PACKAGES_TO_SCAN_FIRST,
				CommonConstants.PACKAGES_TO_SCAN_SECOND, CommonConstants.AUDIT_PACKAGE_TO_SCAN });
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	/**
	 * Generate Data Source Bean configuring JDBC properties
	 * 
	 * @return
	 */
	@Bean
	public DataSource dataSource() {

		if (datasource == null) {
			HikariConfig config = new HikariConfig();

			config.setJdbcUrl(systemPropertyReader.getProperty(CommonConstants.JDBC_URL));
			config.setUsername(systemPropertyReader.getProperty(CommonConstants.JDBC_USERNAME));
			config.setPassword(systemPropertyReader.getProperty(CommonConstants.JDBC_PASS));

			/* Changes Related to Database Connection Issue */
			config.setIdleTimeout(CommonConstants.IDLE_TIME_OUT_MS);
			config.setConnectionTimeout(CommonConstants.CONNECTION_TIME_OUT);
			config.setValidationTimeout(CommonConstants.VALIDATION_TIME_OUT);
			config.setMaxLifetime(CommonConstants.MAX_LIFE_TIME);
			/* Database Connection Issue Done Here */
			config.setMaximumPoolSize(CommonConstants.TEN);
			config.setAutoCommit(false);
			config.addDataSourceProperty(CommonConstants.CACHE_PREP_STMTS,
					systemPropertyReader.getProperty(CommonConstants.HIBERNATE_CACHEPREPSTMTS));
			config.addDataSourceProperty(CommonConstants.PREP_STMT_CACHE_SIZE,
					systemPropertyReader.getProperty(CommonConstants.HIBERNATE_PREPSTMTCACHESIZE));
			config.addDataSourceProperty(CommonConstants.PREP_STMT_CACHE_SQL_LIMIT,
					systemPropertyReader.getProperty(CommonConstants.HIBERNATE_PREPSTMTCACHESQLLIMIT));
			config.addDataSourceProperty(CommonConstants.USE_SERVER_PREP_STMTS,
					systemPropertyReader.getProperty(CommonConstants.HIBERNATE_USESERVERPREPSTMTS));

			datasource = new HikariDataSource(config);
		}
		return datasource;

	}

	/**
	 * Setup Hibernate Properties
	 * 
	 * @return
	 */
	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put(CommonConstants.HIBERNATE_DIALECT,
				systemPropertyReader.getProperty(CommonConstants.HIBERNATE_DIALECT));
		properties.put(CommonConstants.HIBERNATE_SHOW_SQL,
				systemPropertyReader.getProperty(CommonConstants.HIBERNATE_SHOW_SQL));
		properties.put(CommonConstants.HIBERNATE_FORMAT_SQL,
				systemPropertyReader.getProperty(CommonConstants.HIBERNATE_FORMAT_SQL));
		/*properties.put(CommonConstants.HIBERNATE_CACHE_USE_QUERY_CACHE,
				systemPropertyReader.getProperty(CommonConstants.HIBERNATE_CACHE_USE_QUERY_CACHE));*/
		/*properties.put(CommonConstants.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE,
				systemPropertyReader.getProperty(CommonConstants.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
		properties.put(CommonConstants.HIBERNATE_CACHE_REGION_FACTORY_CLASS,
				systemPropertyReader.getProperty(CommonConstants.HIBERNATE_CACHE_REGION_FACTORY_CLASS));*/
		properties.setProperty(CommonConstants.HIBERNATE_ENVERS_AUDIT_TABLE_SUFFIX_PROP,
				CommonConstants.HIBERNATE_ENVERS_AUDIT_TABLE_SUFFIX_VALUE);
		properties.setProperty(CommonConstants.HIBERNATE_JDBC_BATCH_SIZE,
				systemPropertyReader.getProperty(CommonConstants.HIBERNATE_JDBC_BATCH_SIZE));
		properties.setProperty(CommonConstants.HIBERNATE_ENVERS_STORE_DATA_AT_DELETE, "true");

		return properties;
	}

	/**
	 * Generate transaction manager
	 * 
	 * @param s
	 * @return HibernateTransactionManager
	 */
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(s);
		return txManager;
	}

}