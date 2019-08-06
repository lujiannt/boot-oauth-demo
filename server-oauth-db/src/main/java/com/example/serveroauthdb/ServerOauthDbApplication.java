package com.example.serveroauthdb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.serveroauthdb.mapper")
public class ServerOauthDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerOauthDbApplication.class, args);
    }

}
