package com.ydy.user.controller;


import com.ydy.commons.entity.HttpResult;
import com.ydy.exception.MyException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {


    @GetMapping("/exception")
    public HttpResult exception(){
        try {
            throw  new MyException("自定义异常");
        }catch (MyException e){
            System.out.println(e);
            return HttpResult.error500(e.getMessage());
        }
    }
}
