package com.ydy.user;

import com.ydy.BaseTest;
import com.ydy.commons.entity.UserInfo;
import com.ydy.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
public class UserMapperTest extends BaseTest {

    @Autowired
    private UserMapper userMapper;

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
}
