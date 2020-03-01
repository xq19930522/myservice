package com.example.cloud.controller;

import com.example.cloud.bean.ValidCode;
import com.example.cloud.service.ValidCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValidCodeController {
    @Autowired
    private ValidCodeService service;

    @GetMapping(value = "/validCode")
    public String validCode(@RequestParam(value = "phoneNumber") String phoneNumber) {
        return service.validCode(phoneNumber);
    }

    @GetMapping(value = "/findCode")
    public List<ValidCode> findCode() {
        return service.findAll();
    }


}
