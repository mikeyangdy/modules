package com.ydy.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtApp {

    public static void main(String[] args) {
        SpringApplication.run(JwtApp.class,args);
        System.out.println("ok");
    }
}
