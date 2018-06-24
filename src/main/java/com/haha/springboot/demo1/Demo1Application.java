package com.haha.springboot.demo1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.haha.springboot.demo1.controller")
public class Demo1Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		//return super.configure(builder);
		return builder.sources(this.getClass());
	}
}
