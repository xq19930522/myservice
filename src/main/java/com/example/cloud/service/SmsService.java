package com.example.cloud.service;


import com.example.cloud.bean.Sms;

import java.util.List;

public interface SmsService {
    List<Sms> queryAll(String localNumber);

    String insertSmsToDB(String localNumber, String address, long date, int type, String body);




}
