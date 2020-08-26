package com.ydy.taskasync.task;

import org.springframework.scheduling.annotation.Async;

public class Task {

    @Async
    public  void doTask(){
        System.out.println(Thread.currentThread());
    }
}
