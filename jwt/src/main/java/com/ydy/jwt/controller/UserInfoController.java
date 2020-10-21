package com.ydy.jwt.controller;


import com.auth0.jwt.JWT;
import com.ydy.commons.vo.BaseResponse;
import com.ydy.jwt.entity.UserInfo;
import com.ydy.jwt.service.UserInfoService;
import com.ydy.jwt.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping(value = "/login")
    public Object login(@RequestBody UserInfo userInfo){

        String token = JwtUtil.sign(userInfo);
        return BaseResponse.success(token);
    }

    @PostMapping(value = "/userInfoList")
    public Object userInfoList(){
        List<UserInfo> userInfos = userInfoService.queryUserInfoList();
        return BaseResponse.success(userInfos);
    }

    @PostMapping(value = "/ex")
    public Object ex(){
        int i = 1/0;
        return BaseResponse.success();
    }
}
