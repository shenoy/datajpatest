package com.springbootjpatest.springbootjpatest;

import com.springbootjpatest.springbootjpatest.entity.Todo;
import com.springbootjpatest.springbootjpatest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootjpatestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpatestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
