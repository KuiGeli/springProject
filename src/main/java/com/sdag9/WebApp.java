package com.sdag9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.sdag9")
public class WebApp {

    public static void main(String[] args) {

        SpringApplication.run(WebApp.class, args);
    }

}
