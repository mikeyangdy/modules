package com.ydy.excel2java;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import org.springframework.util.StringUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

public class TestMain {

    public static void main(String[] args) throws Exception {
        String filePath = "D:\\javaWeb\\Project\\modules\\excel2Java\\src\\main\\resources\\demo.xlsx";
        List<ExcelData> list = ExcelImportUtil.importExcel(new FileInputStream(filePath), ExcelData.class, new ImportParams());

        String classPath = TestMain.class.getResource(".").getPath();
        String filePatch = classPath + "Test.java";

        System.out.println(filePatch);

        FileOutputStream out = new FileOutputStream(filePatch);

        StringBuilder str = new StringBuilder();
        str.append("public class Test{ \n");

        for (ExcelData data : list) {
            if (StringUtils.isEmpty(data.getCode()) || StringUtils.isEmpty(data.getDataType())) {
                continue;
            }
            String dataType = getCodeType(data.getDataType());
            str.append("\t/**\n");
            str.append("\t * "+data.getRemark()+"\n");
            str.append("\t**/\n");
            str.append("\t @NotNull()\n");
            str.append("\t private  " + dataType + "  " + data.getCode() + ";\n");
        }
        str.append("}\n");
        out.write(str.toString().getBytes());
        out.close();
    }

    private static String getCodeType(String type) {
        if (type == null) {
            return "String";
        }
        if (type.contains("字符串")) {
            return "String";
        } else if (type.contains("日期") || type.contains("时间")) {
            return "Date";
        } else if (type.contains("数字") || type.contains("NUMBER")) {
            return "double";
        } else if (type.contains("字符")) {
            return "int";
        } else {
            return "String";
        }
    }
}
