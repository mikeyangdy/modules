package com.ydy.mytest.entity;

import lombok.Data;

@Data

public class Student {
    private String id;
    private String name;

    private String sex;

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
}
