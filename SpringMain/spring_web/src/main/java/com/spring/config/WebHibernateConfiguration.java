package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.koala.rhschedule.util.system.config.HibernateConfiguration;
import com.spring.constants.CommonConstants;

/**
 * 
 * Hibernate configuration for Web Module
 *
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = { CommonConstants.BASE_PACKAGES })
public class WebHibernateConfiguration extends HibernateConfiguration {

}
