package com.ydy.jwt.dao;

import com.ydy.jwt.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserInfoDao extends JpaRepository<UserInfo,String> {
}
