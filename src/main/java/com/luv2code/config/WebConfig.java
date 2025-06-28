package com.luv2code.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Global configuration
//@Configuration
public class WebConfig implements WebMvcConfigurer {
 @Override
 public void addCorsMappings(CorsRegistry registry) {
     registry.addMapping("/**") // allow all endpoints
             .allowedOrigins("http://localhost:3000") // frontend URL
             .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
             .allowedHeaders("*")
             .allowCredentials(true);
 }
}

