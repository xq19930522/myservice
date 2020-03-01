package com.example.cloud.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    public Object  hello(){
        return  "maven 部署成功";
    }








}
