package com.ydy.modules.contact.service.impl;

import com.ydy.modules.contact.entity.UserAcnt;
import com.ydy.modules.contact.mapper.UserAcntMapper;
import com.ydy.modules.contact.service.IUserAcntService;
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
 * @since 2020-08-14
 */
@Service
public class UserAcntServiceImpl extends ServiceImpl<UserAcntMapper, UserAcnt> implements IUserAcntService {

}
