package com.taoheng.maven.test.webdemo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
@ConfigurationProperties(prefix = "server")
public class Person {
    private Integer port;

    private String name = "hello";

//    @JSONField(format = "yyyy-MM-dd")
    private Date date = new Date();

}
