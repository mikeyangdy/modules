package com.ydy.utils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import java.lang.reflect.Field;

/**
 *@Author yangduyu
 *@Date 2020/9/8
 *@Description 条件构造器工具
 */
public class WrapperUtil {

    public static void equalWrapper(QueryWrapper<?> wrapper, Object obj){
        Class cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields){
            f.setAccessible(true);
            try {
                if(null != f.get(obj)){
                    System.out.println(f.getName());
                    System.out.println(f.get(obj));
                    wrapper.eq(humpToLine(f.getName()),f.get(obj));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 驼峰转下划线
     * @param str
     * @return
     */
    public static String humpToLine(String str) {
        return str.replaceAll("[A-Z]", "_$0").toUpperCase();
    }
}
