package com.ydy.myweb.bean;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlTestBean {

    @XmlElement(name = "aaa")
    private String aaa;

    @XmlElement(name = "bbb")
    private String bbb;
}
