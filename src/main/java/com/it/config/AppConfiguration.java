package com.it.config;


import org.springframework.context.annotation.*;



@Configuration
@Import({DataBaseConfiguration.class,DispatcherServletInitializer.class,WebConfiguration.class})
@ComponentScan("com.it")


public class AppConfiguration {

}