package com.ydy.testMain;


import com.ydy.commons.vo.BaseResponse;

public class MethodRuntimeException {

    public static void main(String[] args) {
//        System.out.println("main111");
//        methodFirst();
//        System.out.println("main222");


        try {
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }


    private static void methodFirst(){
        System.out.println("methodFirst111");
        methodSecond();
        System.out.println("methodFirst222");
    }

    private static void methodSecond(){
        System.out.println("methodSecond111");

        throw new RuntimeException("methodSecond error");
    }
}
