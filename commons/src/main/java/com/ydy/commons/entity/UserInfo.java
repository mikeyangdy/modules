package com.ydy.commons.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class UserInfo {

    @TableId(value = "id",type = IdType.ASSIGN_UUID)
    private String id ;

    private String username;

    private String password;

    private String type;
}
