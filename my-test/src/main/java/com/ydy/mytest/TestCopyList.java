package com.ydy.mytest;


import com.ydy.mytest.entity.Student;
import com.ydy.mytest.entity.Student2;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class TestCopyList {


    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("1","2"));

        List<Student2> list2=  new ArrayList<>();//(List<Student2>) entity2VO(list,Student2.class);

        BeanUtils.copyProperties(list,list2);

        System.out.println(1);
    }


    private static  <T> List<T> entity2VO(List<?> list,Class<T> cls) throws IllegalAccessException, InstantiationException {
        List<T> listRet = new ArrayList<>();
        for (Object o : list) {
            T obj =  cls.newInstance();
            BeanUtils.copyProperties(o,obj);
            listRet.add(obj);
        }
        return listRet;
    }
}
