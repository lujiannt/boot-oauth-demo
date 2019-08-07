package com.example.serveroauthsso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableResourceServer
@MapperScan("com.example.serveroauthsso.mapper")
public class ServerOauthSsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerOauthSsoApplication.class, args);
    }

}
