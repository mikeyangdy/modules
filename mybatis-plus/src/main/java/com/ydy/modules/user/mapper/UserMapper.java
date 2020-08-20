package com.ydy.modules.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ydy.commons.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserMapper extends BaseMapper<UserInfo> {

}
