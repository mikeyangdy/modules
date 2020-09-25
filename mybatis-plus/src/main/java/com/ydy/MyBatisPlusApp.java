package com.ydy;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ydy.modules.*.mapper")
@SpringBootApplication
@Slf4j
public class MyBatisPlusApp {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusApp.class, args);
        System.out.println("ok");


        MyBatisPlusApp.test();
    }

    private static void test() {
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUsername("admin");
//        userInfo.setComFlg("flg");
//        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
//        WrapperUtil.equalWrapper(queryWrapper, userInfo);
//        System.out.println(queryWrapper.getTargetSql());
    }

}
