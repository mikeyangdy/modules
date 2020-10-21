package com.ydy.mytest;

import cn.hutool.core.collection.CollUtil;
import com.ydy.mytest.entity.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListRemoveTest {


    public static void main(String[] args) {





        List<Student> list_1 = new ArrayList<>();
        List<Student> list_2 = new ArrayList<>();

        for (int i=0;i<10;i++){
            list_1.add(new Student("张"+(i+1),i%3==0?"男":"女"));
        }

        for (int i=0;i<5;i++){
            list_2.add(new Student("张"+(i+1),i%2==0?"男":"女"));
        }

        List<Student> list_3 = CollUtil.subtractToList(list_1, list_2);

       // System.out.println(1);


        System.out.println(getForReturnValue());
    }


    public static String getForReturnValue (){
        String[] s = {"1","2","3","4"};

        for (String s1 : s) {
            System.out.println(11111);
            if (s1.equals("2")){
                return s1;
            }
        }
        return "";
    }
}
