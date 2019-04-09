package com.it.config;


import org.springframework.context.annotation.*;



@Configuration
@Import({DataBaseConfiguration.class,WebConfiguration.class})

public class AppConfiguration {

}