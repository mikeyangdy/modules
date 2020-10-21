package com.ydy.modules.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ydy.BaseTest;

import com.ydy.modules.user.entity.UserInfo;
import com.ydy.modules.user.mapper.UserInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;
import java.sql.Wrapper;


@Slf4j
public class UserMapperTest extends BaseTest {


    @Resource
    private UserInfoMapper userInfoMapper;

    @Test
    public void delete(){

        QueryWrapper<UserInfo> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(UserInfo::getType,1);
        userInfoMapper.delete(wrapper);
    }
}
