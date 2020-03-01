package com.example.cloud.controller;

import com.example.cloud.bean.Sms;
import com.example.cloud.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;






@RequestMapping(value = "/sms")
@RestController
public class SmsController {

    @Autowired
    private SmsService service;

    @GetMapping(value = "/findAll")
    public List<Sms> findAll(@RequestParam(value = "localNumber") String localNumber) {
        return service.queryAll(localNumber);
    }

    @PostMapping(value = "/insertSms")
    public String insertSmsToDB(@RequestParam(value = "localNumber") String localNumber, @RequestParam(value = "address") String address,
                                @RequestParam(value = "date") long date, @RequestParam(value = "type") int type,
                                @RequestParam(value = "body") String body) {
        return service.insertSmsToDB(localNumber, address, date, type, body);
    }


}
