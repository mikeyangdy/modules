package com.ydy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ydy.commons.entity.UserInfo;
import com.ydy.mapper.UserMapper;
import com.ydy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl extends ServiceImpl<UserMapper, UserInfo> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean saveUser() {
        return this.save(new UserInfo());
    }
}
