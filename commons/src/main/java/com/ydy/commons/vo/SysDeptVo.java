package com.ydy.commons.vo;

import com.ydy.commons.entity.SysDept;
import lombok.Data;

import java.util.List;

@Data
public class SysDeptVo extends SysDept {
    private List<SysDeptVo> children;
}
