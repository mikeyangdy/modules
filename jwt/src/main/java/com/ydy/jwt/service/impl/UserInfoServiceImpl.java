package com.ydy.jwt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ydy.jwt.entity.UserInfo;
import com.ydy.jwt.mapper.UserInfoMapper;
import com.ydy.jwt.service.UserInfoService;
import com.ydy.jwt.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> queryUserInfoList() {

        return userInfoMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public String checkUser(UserInfo userInfo) {
        QueryWrapper<UserInfo> qwUser = new QueryWrapper<>();
        qwUser.eq("username",userInfo.getUsername());
        qwUser.eq("password",userInfo.getPassword());
        UserInfo queryUserInfo = userInfoMapper.selectOne(qwUser);
        if (null == queryUserInfo){
            throw new RuntimeException("用户登录失败");
        }
        return JwtUtil.sign(userInfo);
    }

}
