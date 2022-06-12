package com.springbootjpatest.springbootjpatest.config;

import com.springbootjpatest.springbootjpatest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Autowired
    CourseService courseService;

    @Bean
    public CourseService courseService(){
        return courseService;
    }
}
