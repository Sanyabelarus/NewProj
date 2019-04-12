package com.it.config;


import org.springframework.context.annotation.*;


/**
 * Configuration class for database module of project
 */
@Configuration
@ComponentScan(basePackages = "com.it")
@Import({DataBaseConfiguration.class,WebConfiguration.class})

public class AppConfiguration {

}