package com.ydy.swagger2.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Api(tags = "swagger测试API")
public class SwaggerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/restTemplateT")
    public String restTemplateT(){
        return restTemplate.getForObject("http://121.199.2.1/getJson",String.class);
    }

    @GetMapping("/getJson")
    @ApiOperation(value = "获取测试json数据",notes = "哈哈哈")
    public JSONObject getJson(){
        return new JSONObject(){{put("username","mike");}};
    }
}
