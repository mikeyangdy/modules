package com.ydy;

import com.ydy.commons.entity.Bean.BeanA;
import com.ydy.commons.entity.Bean.BeanB;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ydy.modules.*.mapper")
@SpringBootApplication
@Slf4j
public class MyBatisPlusApp {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusApp.class,args);
        System.out.println("ok");

        BeanA a = new BeanA("1","2","3");
        BeanB b = new BeanB();
        BeanUtils.copyProperties(a,b);

        System.out.println(b.toString());
    }

}
