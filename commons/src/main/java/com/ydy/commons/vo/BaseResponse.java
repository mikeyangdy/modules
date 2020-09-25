package com.ydy.commons.vo;

import lombok.Data;


@Data
public class BaseResponse<T> {
    private String code;
    private String msg;
    private T data;

    public BaseResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> BaseResponse success(String msg, T data){
        return new BaseResponse<>("200",msg,data);
    }

    public static <T> BaseResponse success(T data){
        return new BaseResponse<>("200","success",data);
    }

    public static <T> BaseResponse success(){
        return new BaseResponse<>("200","success",null);
    }

    public static <T> BaseResponse fail(String code,String msg){
        return new BaseResponse<>(code,msg,null);
    }

}
