package com.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    //解决 RestTemplate 找不到原因，应该把 RestTemplate 注册SpringBoot容器中 @bean
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
