package com.ydy.order.service.impl;

import com.ydy.order.entity.UserAcnt;
import com.ydy.order.mapper.UserAcntMapper;
import com.ydy.order.service.IUserAcntService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账号。
该账号是用户在本系统使用的账号信息。
在一个系统中，账号存在唯一性。
内 服务实现类
 * </p>
 *
 * @author ydy
 * @since 2020-08-17
 */
@Service
public class UserAcntServiceImpl extends ServiceImpl<UserAcntMapper, UserAcnt> implements IUserAcntService {

}
