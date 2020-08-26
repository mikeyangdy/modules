package com.ydy;

import com.ydy.user.entity.Stu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class ExceptionApp {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionApp.class,args);
        System.out.println("ok");

        Stu stu = new Stu();
        System.out.println(stu);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
