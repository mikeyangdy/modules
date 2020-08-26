package com.ydy.taskasync;

import com.ydy.taskasync.task.Task;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TaskAsyncApp {

    public static void main(String[] args) {
        SpringApplication.run(TaskAsyncApp.class,args);
        System.out.println("ok");

//        Task task = new Task();
//        for(int i=0;i<5;i++){
//            task.doTask();
//        }

    }
}
