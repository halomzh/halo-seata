package com.aha.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shoufeng
 */
@SpringBootApplication
@EnableFeignClients
public class AhaConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(AhaConsumerApp.class, args);
    }
}
