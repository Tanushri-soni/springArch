package com.spring.config;

import java.io.IOException;
import java.util.Properties;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.ui.velocity.VelocityEngineFactory;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.koala.rhschedule.util.property.reader.PropertyReader;
import com.spring.constants.CommonConstants;
import com.spring.utill.ErrorCodeHelper;
import com.spring.utill.ValidationUtils;

/**
 * 
 * MVC configuration file to register interceptors
 *
 */
@EnableScheduling
@EnableWebMvc
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAsync
@EnableRetry
@ComponentScan(basePackages = CommonConstants.BASE_PACKAGES)
public class WebMvcConfig extends WebMvcConfigurerAdapter {



	/**
	 * Bean to create MessageSource
	 * 
	 * @return MessageSource
	 */
	/*@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename(CommonConstants.SET_BASENAME);
		messageSource.setDefaultEncoding(CommonConstants.SET_DEFAULT_ENCODING);
		messageSource.setCacheSeconds(CommonConstants.SET_CACHE_SECONDS);
		return messageSource;
	}*/

	/**
	 * Bean to create CommonsMultiPartResolver to upload or download file
	 * 
	 * @return CommonsMultipartResolver
	 */
/*	@Bean(name = CommonConstants.MULTIPART_RESOLVER)
	public CommonsMultipartResolver createMultipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding(CommonConstants.SET_DEFAULT_ENCODING);

		return resolver;
	}*/

	/**
	 * Bean to create query property reader
	 * 
	 * @return PropertyReader
	 */
	@Bean(name = CommonConstants.QUERY_PROPERTY_READER)
	public PropertyReader propertReader() {
		return new PropertyReader(CommonConstants.QUERY_PROPERTIES_FILENAME, "");
	}

	/**
	 * Bean to create error property reader
	 * 
	 * @return PropertyReader
	 */
	@Bean(name = CommonConstants.ERROR_PROPERTY_READER)
	public PropertyReader errorPropertReader() {
		return new PropertyReader(CommonConstants.ERROR_PROPERTIES_FILENAME, "");
	}

	/**
	 * Bean to create error code helper
	 * 
	 * @return ErrorCodeHelper
	 */
	@Bean(name = CommonConstants.ERROR_CODE_HELPER)
	public ErrorCodeHelper errorCodeHelper() {
		return new ErrorCodeHelper();
	}

	/**
	 * Bean to create validation utils
	 * 
	 * @return ValidationUtils
	 */
	@Bean(name = CommonConstants.VALIDATION_UTILS)
	public ValidationUtils validationUtills() {
		return new ValidationUtils();
	}

	/**
	 * Add resource handlers
	 * 
	 * @param registry
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
	

	/**
	 * Bean to create velocity engine
	 * 
	 * @return VelocityEngine
	 * @throws VelocityException
	 * @throws IOException
	 */
	@Bean
	public VelocityEngine getVelocityEngine() throws IOException {
		VelocityEngineFactory velocityEngineFactory = new VelocityEngineFactory();
		Properties props = new Properties();
		props.put(CommonConstants.RESOURCE_LOADER, CommonConstants.RESOURCE_LOADER_VALUE);
		props.put(CommonConstants.RESOURCE_LOADER_CLASS, CommonConstants.RESOURCE_LOADER_CLASS_VALUE);
		//props.put(CommonConstants.RESOURCE_LOADER_FILE_PATH, systemPropertyReader().getProperty(CommonConstants.RESOURCE_LOADER_FILE_PATH_VALUE));

		velocityEngineFactory.setVelocityProperties(props);
		return velocityEngineFactory.createVelocityEngine();
	}

	/**
	 * Bean to create JavaMailSender
	 * 
	 * @return JavaMailSender
	 */
	@Bean
	public JavaMailSender getMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		String port = systemPropertyReader().getProperty(CommonConstants.MAIL_SMTP_PORT_PROPERTY);

		String smtpAuthentication = systemPropertyReader().getProperty(CommonConstants.MAIL_SMTP_AUTH_PROPERTY);

		String smtpStartTLSEnable = systemPropertyReader()
				.getProperty(CommonConstants.MAIL_SMTP_START_TLS_ENABLE_PROPERTY);

		String host = systemPropertyReader().getProperty(CommonConstants.HOST);

		String userName = systemPropertyReader().getProperty(CommonConstants.USERNAME);

		String identification = systemPropertyReader().getProperty(CommonConstants.PASS);

		String mailTransportProtocol = systemPropertyReader()
				.getProperty(CommonConstants.MAIL_TRANSPORT_PROTOCOL_PROPERTY);
		String mailDebug = systemPropertyReader().getProperty(CommonConstants.MAIL_DEBUG_TRUE_PROPERTY);

		mailSender.setHost(host);
		mailSender.setPort(Integer.parseInt(port));
		mailSender.setUsername(userName);
		mailSender.setPassword(identification);

		Properties javaMailProperties = new Properties();
		javaMailProperties.put(CommonConstants.MAIL_SMTP_START_TLS_ENABLE, smtpStartTLSEnable);
		javaMailProperties.put(CommonConstants.MAIL_SMTP_AUTH, smtpAuthentication);
		javaMailProperties.put(CommonConstants.MAIL_TRANSPORT_PROTOCOL, mailTransportProtocol);
		javaMailProperties.put(CommonConstants.MAIL_DEBUG, mailDebug);

		mailSender.setJavaMailProperties(javaMailProperties);
		return mailSender;
	}	

	/**
	 * Bean to create system property reader
	 * 
	 * @return PropertyReader
	 */
	@Bean(name = CommonConstants.SYSTEM_PROPERTY_READER)
	public PropertyReader systemPropertyReader() {
		return new PropertyReader(CommonConstants.SYSTEM_PROPERTIES, "");
	}

	/**
	 * Property reader to read candidate.saml.properties
	 * 
	 * @return PropertyReader
	 */
	@Bean(name = CommonConstants.CANDIDATE_SAML_PROPERTY_READER)
	public PropertyReader candidateSamlPropertyReader() {
		return new PropertyReader(CommonConstants.CANDIDATE_SAML_PROPERTY_FILE, CommonConstants.SYSTEM_FILE_PATH);
	}

	/**
	 * Property reader to read admin.saml.properties
	 * 
	 * @return PropertyReader
	 */
	@Bean(name = CommonConstants.ADMIN_SAML_PROPERTY_READER)
	public PropertyReader adminSamlPropertyReader() {
		return new PropertyReader(CommonConstants.ADMIN_SAML_PROPERTY_FILE, CommonConstants.SYSTEM_FILE_PATH);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("/externaluser/login");
	}
}
