package com.example.springbatchessentials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBatchEssentialsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchEssentialsApplication.class, args);
    }

}
