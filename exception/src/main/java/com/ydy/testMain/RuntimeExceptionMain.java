package com.ydy.testMain;


public class RuntimeExceptionMain {

    public static void main(String[] args) {
        RuntimeExceptionMain main = new RuntimeExceptionMain();

        main.errorMethod();

        System.out.println("main end");
    }


    public String errorMethod(){
        try {
            int i = 1/0;

        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("error");
//            return "111";
        }finally {
            System.out.println("finally");

        }
        System.out.println("error end");
        return "error";
    }

    public int method(){
        int n = 100;
        int m = 10;
        while(m>-1){
            m--;
            n = n/m;//***抛出一个分母为0的算术异常
            try {
                if(m==9){
                    throw new Exception("m不能为9");//***抛出一个新的Exception异常'实例'.
                }
            } catch (Exception e) {
                System.out.println("我们将对抛出异常的“语句”：throw new Exception('m不能为9')作出处理。");
                e.printStackTrace();
                //throw e;或者throw new Exception();//***抛出异常e实例或新的Exception实例
            }
        }
        return n;
    }
}



