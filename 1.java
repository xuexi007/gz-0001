package com.example.springbootdemo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){

        return "Hello JAVA1105!";
    }
}
