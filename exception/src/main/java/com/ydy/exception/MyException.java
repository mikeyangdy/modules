package com.ydy.exception;


/*
 *@Author YDY
 *@Date 2020/7/22
 *@Description 自定义异常
 */
public class MyException extends RuntimeException {

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
