package com.ydy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ydy.commons.entity.UserInfo;

public interface UserService extends IService<UserInfo> {

    boolean saveUser();
}
