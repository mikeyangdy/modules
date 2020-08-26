package com.ydy.exception;

import com.ydy.commons.entity.HttpResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
 *@Author YDY
 *@Date 2020/7/22
 *@Description 自定义handler 捕获 controller异常
 */

@Slf4j
@RestControllerAdvice
public class MyExceptionHandler {

    /**
     * 捕捉处理自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(MyException.class)
    public HttpResult my(MyException e){
        log.error(e.getMessage(),e);
        return HttpResult.error500("my exception");
    }


//    @ExceptionHandler(DuplicateKeyException.class)
//    public HttpResult duplicateKey(DuplicateKeyException e){
//        log.error(e.getMessage(),e);
//        return HttpResult.error500(e.getMessage());
//    }
}
