package com.ydy.mytest;

import org.apache.tomcat.util.buf.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        String str = "myCofingAbc";
        System.out.println(str.replaceAll("[A-Z]", "_$0").toUpperCase());

        new ArrayList<String>(){{add("123");add("233");}}.forEach(System.out::println);

        StringBuilder strLogFlag = new StringBuilder("hello");
        strLogFlag.setCharAt(3,'X');
        System.out.println(strLogFlag.toString());

        List<String> strList = Arrays.asList("123", "456", "789");

        System.out.println(StringUtils.join(strList, '-'));
    }
}
