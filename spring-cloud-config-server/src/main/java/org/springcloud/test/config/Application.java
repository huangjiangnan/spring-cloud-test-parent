package org.springcloud.test.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@EnableDiscoveryClient
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "org.springcloud.test.config")
public class Application extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	
}
