package com.ydy.jwt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ydy.jwt.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserInfoMapper  extends BaseMapper<UserInfo>  {

}
