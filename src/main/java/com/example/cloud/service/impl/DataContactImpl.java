package com.example.cloud.service.impl;

import com.example.cloud.bean.DataContact;
import com.example.cloud.repository.DataContactRepository;
import com.example.cloud.service.DataContactService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;






@Service
public class DataContactImpl implements DataContactService {

    @Autowired
    private DataContactRepository repository;

    @Override
    public void writeContactToMysql(String json) {
        Gson gson = new Gson();
        List<DataContact> contacts = gson.fromJson(json, new TypeToken<List<DataContact>>() {
        }.getType());
        for (DataContact contact : contacts) {
            repository.save(contact);
        }
    }

    @Override
    public List<DataContact> findAllFromDataContact() {
        return repository.findAll();
    }
}
