package com.example.cloud.service;


import com.example.cloud.bean.DataContact;

import java.util.List;

public interface DataContactService {
    void writeContactToMysql(String json);

    List<DataContact> findAllFromDataContact();
}
