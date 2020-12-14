package com.ydy.mytest;

import com.alibaba.fastjson.JSONObject;
import com.ydy.mytest.entity.ObjA;
import com.ydy.mytest.entity.ObjB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjTest {


    public static void main(String[] args) {

        String flag = "";

        while (flag.length() < 32) {
            flag = "0" + flag;
        }

        System.out.println(flag.length());
        System.out.println(flag);
    }
}
