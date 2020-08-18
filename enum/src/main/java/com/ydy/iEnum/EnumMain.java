package com.ydy.iEnum;

import com.ydy.iEnum.enumBean.ColorEnum;
import com.ydy.iEnum.enumBean.TestEnum;

public class EnumMain {

    public static void main(String[] args) {

        System.out.println(TestEnum.Apple.getValue());
        System.out.println(ColorEnum.WHITE.hashCode());

    }

}
