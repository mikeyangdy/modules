package com.ydy.jwt;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ydy.jwt.dao.UserInfoDao;
import com.ydy.jwt.mapper.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest(classes = JwtApp.class)
@RunWith(SpringRunner.class)
public class JwtTest {

    @Autowired
    private UserInfoDao userDao;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void t1(){
        userDao.findAll().forEach(System.out::println);
    }

    @Test
    public void t2(){

        userInfoMapper.selectList(new QueryWrapper<>()).forEach(System.out::println);
    }


}
