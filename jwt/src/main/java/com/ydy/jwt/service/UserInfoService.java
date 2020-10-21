package com.ydy.jwt.service;

import com.ydy.jwt.entity.UserInfo;

import java.util.List;

public interface UserInfoService {

    List<UserInfo> queryUserInfoList();

    String checkUser(UserInfo userInfo);
}
