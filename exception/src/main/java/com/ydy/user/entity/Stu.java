package com.ydy.user.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Stu {

    @NotNull(message = "id不能为空")
    private String id;

    @NotNull(message = "学号不能为空")
    private String stuNo;

}
