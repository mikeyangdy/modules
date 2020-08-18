package com.ydy.commons.entity;


import com.ydy.commons.contant.ResultContant;
import lombok.Data;

/*
 *@Author YDY
 *@Date 2020/7/22
 *@Description 请求返回值 对象
 */
@Data
public class Result<T>{
    private int code;
    private String msg;
    private T data;

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Result ok(String msg){
        return new Result(200,msg);
    }

    public static Result error500(String msg){
        return new Result(ResultContant.ERROR_500,msg);
    }

    public static Result error404(String msg){
        return new Result(ResultContant.ERROR_404,msg);
    }

}
