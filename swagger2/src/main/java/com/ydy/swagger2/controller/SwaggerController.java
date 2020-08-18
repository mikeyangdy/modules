package com.ydy.swagger2.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "swagger测试API")
public class SwaggerController {

    @GetMapping("/getJson")
    @ApiOperation(value = "获取测试json数据",notes = "哈哈哈")
    public JSONObject getJson(){
        return new JSONObject(){{put("username","mike");}};
    }
}
