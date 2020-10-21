package com.ydy.jwt.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    private String id ;

    private String username;

    private String password;

    private String type;
}
