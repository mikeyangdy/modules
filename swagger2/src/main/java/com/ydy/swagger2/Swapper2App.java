package com.ydy.swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Swapper2App {
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(Swapper2App.class,args);

        Environment env = appContext.getEnvironment();
        String port = env.getProperty("server.port");

        System.out.println("http://localhost:"+port+"/doc.html");
        System.out.println("http://localhost:"+port+"/swagger-ui.html");



    }
}
