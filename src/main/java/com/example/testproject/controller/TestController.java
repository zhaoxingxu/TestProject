package com.example.testproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/test/test",method = RequestMethod.GET)
    public String test(){
        return "OK";
    }
    @RequestMapping(value = "/test",method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
    public String test2(){
        return "OK";
    }
}
