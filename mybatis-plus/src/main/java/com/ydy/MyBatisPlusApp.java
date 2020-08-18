package com.ydy;

import com.ydy.commons.entity.Bean.BeanA;
import com.ydy.commons.entity.Bean.BeanB;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ydy")
@SpringBootApplication
public class MyBatisPlusApp {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusApp.class,args);


        BeanA a = new BeanA("1","2","3");
        BeanB b = new BeanB();
        BeanUtils.copyProperties(a,b);

        System.out.println(b.toString());
    }

}
