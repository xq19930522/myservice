package com.example.cloud.service.impl;

import com.example.cloud.bean.CloudImage;
import com.example.cloud.repository.CloudImageRepository;
import com.example.cloud.service.CloudImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudImageServiceImpl implements CloudImageService {

    @Autowired
    private CloudImageRepository repository;

    @Override
    public List<CloudImage> findAll() {
        return repository.findAll();
    }

    @Override
    public CloudImage insert(String localNumber, String path, String url, String type) {
        CloudImage image = new CloudImage();
        image.setMynumber(localNumber);
        image.setPath(path);
        image.setUrl(url);
        image.setType(type);
        return repository.save(image);
    }
}
