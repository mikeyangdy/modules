package com.ydy.controller;


import com.ydy.commons.entity.Result;
import com.ydy.exception.MyException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/exception")
    public Result exception(){

        try {
            throw  new MyException("自定义异常");
        }catch (MyException e){
            System.out.println(e);
            return Result.error500(e.getMessage());
        }
    }
}
