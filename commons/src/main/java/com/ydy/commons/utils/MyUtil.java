package com.ydy.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 *@Author yangduyu
 *@Date 2020/8/26
 *@Description 工具类
 */
public class MyUtil {

    /** 获取UUID */
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }



    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    /** 获取当前日期时间字符串 */
    public static String getCurrentDateTimeString(){
        return simpleDateFormat.format(new Date());
    }

    /**
     * 获取当前日期时间字符串 by format自定义格式
     * @param strFormat
     * @return
     */
    public static String getCurrentDateTimeStringByFormat(String strFormat){
        return new SimpleDateFormat(strFormat).format(new Date());
    }

}
