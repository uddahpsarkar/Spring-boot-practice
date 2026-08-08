package com.example.demo;

// 1. THESE GO AT THE VERY TOP OF YOUR JAVA FILE (NOT IN TERMINAL!)
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "com.example.ecommerce"})
@EntityScan(basePackages = {"com.example.ecommerce.model"})
@EnableJpaRepositories(basePackages = {"com.example.ecommerce.repository"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
