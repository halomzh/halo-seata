package com.aha.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shoufeng
 */

@SpringBootApplication
@EnableFeignClients
public class AhaProducerApp {
    public static void main(String[] args) {
        SpringApplication.run(AhaProducerApp.class, args);
    }
}
