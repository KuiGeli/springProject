package com.sdag9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EntityScan("com.sdag9")
@EnableWebSecurity
public class WebApp {

    public static void main(String[] args) {

        SpringApplication.run(WebApp.class, args);
    }

}
