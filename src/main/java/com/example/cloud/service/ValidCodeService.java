package com.example.cloud.service;


import com.example.cloud.bean.ValidCode;

import java.util.List;

public interface ValidCodeService {
    String validCode(String phoneNumber);

    List<ValidCode> findAll();
}
