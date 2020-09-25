package com.ydy.commons.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInfo {

    private String id ;

    private String username;

    private String password;

    private String type;

    private String comFlg;
}
