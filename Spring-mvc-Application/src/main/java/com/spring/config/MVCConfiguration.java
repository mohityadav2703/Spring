package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
@ComponentScan("com.spring.*")
public class MVCConfiguration extends WebMvcConfigurationSupport{
	

}
