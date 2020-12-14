package com.ydy.mytest.entity;

import lombok.Data;

import java.util.List;

@Data
public class ObjA {
    private String id;

    private List<ObjB> list;
}
