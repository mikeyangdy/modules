package com.ydy.commons.entity;


import com.ydy.commons.constant.ResultConstant;
import lombok.Data;

/*
 *@Author YDY
 *@Date 2020/7/22
 *@Description 请求返回值 对象
 */
@Data
public class HttpResult<T>{
    private int code;
    private String msg;
    private T data;

    public HttpResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static HttpResult ok(String msg){
        return new HttpResult(200,msg);
    }

    public static HttpResult error500(String msg){
        return new HttpResult(ResultConstant.ERROR_500,msg);
    }

    public static HttpResult error404(String msg){
        return new HttpResult(ResultConstant.ERROR_404,msg);
    }

}
