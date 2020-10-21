package com.ydy;

import lombok.Data;

@Data
public class Taa {
    private String nemes;


    public enum 账号类型{
        A(1),B(2),C(3),D(4);

        private int code;

        账号类型(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public static void main(String[] args) {
        System.out.println(Taa.账号类型.C.getCode());
    }
}
