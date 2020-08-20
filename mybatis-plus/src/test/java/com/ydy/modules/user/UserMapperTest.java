package com.ydy.modules.user;

import com.ydy.BaseTest;
import com.ydy.commons.entity.UserInfo;
import com.ydy.modules.user.mapper.UserMapper;
import com.ydy.modules.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Slf4j
public class UserMapperTest extends BaseTest {

    @Autowired
    private UserMapper userMapper;

    @Resource
    private UserService userService;

    @Test
    @Transactional
    public void addUser() {
        UserInfo info = new UserInfo();
        System.out.println(info);
        info.setUsername("mary");
        info.setPassword("123456");
        info.setType("1");

        userMapper.insert(info);
        System.out.println(info);
    }


    @Test
    public void saveUpdate(){

//        userService.saveOrUpdate();
    }
}
