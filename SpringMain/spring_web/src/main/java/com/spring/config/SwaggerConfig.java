package com.spring.config;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.koala.rhschedule.util.property.reader.PropertyReader;
import com.spring.constants.CommonConstants;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger configuartion class
 * 
 * @author
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Autowired
    @Qualifier(value = CommonConstants.SYSTEM_PROPERTY_READER)
    private PropertyReader systemPropertyReader;

    /**
     * primary api configuration for swagger
     * 
     * @return 
     * 		Docker object with api scan configuration for swagger
     */
    @Bean
    public Docket api() {
        List<Parameter> newArrayList = new ArrayList<>(Arrays.asList((Parameter) new ParameterBuilder()
            .name(CommonConstants.HEADER_TOKEN).description("Request validation Token")
            .modelRef(new ModelRef("String")).parameterType("header").required(false).build()));
        
        Boolean isSwaggerEnable = Boolean.valueOf(systemPropertyReader.getProperty("SWAGGER_ENABLED"));

        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any()).build().globalOperationParameters(newArrayList).enable(isSwaggerEnable);
    }
}