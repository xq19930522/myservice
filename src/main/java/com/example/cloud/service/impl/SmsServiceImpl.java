package com.example.cloud.service.impl;

import com.example.cloud.bean.Sms;
import com.example.cloud.repository.SmsRepository;
import com.example.cloud.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SmsServiceImpl implements SmsService {
    @Autowired
    private SmsRepository repository;

    @Override
    public List<Sms> queryAll(String localNumber) {
        List<Sms> mlist = new ArrayList<>();
        List<Sms> smsList = repository.findAll();
        for (Sms sms : smsList) {
            if (sms.getLocalNumber().equals(localNumber)) {
                mlist.add(sms);
            }
        }
        return mlist;
    }

    @Override
    public String insertSmsToDB(String localNumber, String address, long date, int type, String body) {
        Sms sms = new Sms();
        sms.setLocalNumber(localNumber);
        sms.setAddress(address);
        sms.setDate(date);
        sms.setType(type);
        sms.setBody(body);
        repository.save(sms);
        return "success";
    }
}
