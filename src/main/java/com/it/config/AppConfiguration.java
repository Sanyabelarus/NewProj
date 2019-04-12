package com.it.config;


import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ResourceBundleMessageSource;


/**
 * Configuration class for database module of project
 */
@Configuration
@ComponentScan(basePackages = "com.it")
@Import({DataBaseConfiguration.class,WebConfiguration.class})

public class AppConfiguration {
    @Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
        resourceBundleMessageSource.setBasename("logMassage");
        resourceBundleMessageSource.setDefaultEncoding("utf-8");
        return messageSource();
    }
}

