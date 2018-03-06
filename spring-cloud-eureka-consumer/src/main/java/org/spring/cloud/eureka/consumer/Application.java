package org.spring.cloud.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
@ComponentScan(basePackages = "org.spring.cloud.eureka.consumer")
public class Application extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
}
