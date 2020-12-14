package com.ydy.myweb.controller;

import com.ydy.myweb.bean.XmlTestBean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class MyTestController {


    @RequestMapping(value = "/xml" ,produces= {MediaType.APPLICATION_XML_VALUE})
    public Object xml(){
        XmlTestBean xml = new XmlTestBean();
        xml.setAaa("123");
        xml.setBbb("233");
        return xml;
    }
}
