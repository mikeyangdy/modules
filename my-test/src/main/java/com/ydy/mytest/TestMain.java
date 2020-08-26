package com.ydy.mytest;


import com.ydy.commons.utils.MyUtil;

public class TestMain {

    public static void main(String[] args) {

        System.out.println(MyUtil.getUUID());
        System.out.println(MyUtil.getUUID().length());


        System.out.println(MyUtil.getCurrentDateTimeString());

        System.out.println(MyUtil.getCurrentDateTimeStringByFormat("hh:mm:ss"));
    }
}
