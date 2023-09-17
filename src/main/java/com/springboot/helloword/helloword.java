package com.springboot.helloword;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloword {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
