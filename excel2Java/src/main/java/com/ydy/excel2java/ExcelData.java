package com.ydy.excel2java;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

@Data
public class ExcelData {

    @Excel(name = "名称")
    private String name;

    @Excel(name = "代码")
    private String code;

    @Excel(name = "数据类型")
    private String dataType;

    @Excel(name = "备注")
    private String remark;

    @Excel(name = "非空")
    private String notNull;
}
