package com.taoheng.maven.test.webdemo;

import com.taoheng.maven.test.webdemo.controller.HelloController;
import com.taoheng.maven.test.webdemo.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class WebDemoApplicationTests {

    @Autowired
    private HelloController helloController;

    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        log.info("test contextLoads");
        log.info(person.toString());
    }

}
