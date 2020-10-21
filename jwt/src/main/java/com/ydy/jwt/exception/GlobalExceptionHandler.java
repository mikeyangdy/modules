package com.ydy.jwt.exception;

import com.ydy.commons.vo.BaseResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseBody
    public BaseResponse ex(Exception e){
        return  BaseResponse.fail("500",e.getMessage());
    }
}
