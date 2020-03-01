package com.example.cloud.service;


import com.example.cloud.bean.CloudImage;

import java.util.List;


public interface CloudImageService {
    List<CloudImage> findAll();

    CloudImage insert(String localNumber, String path, String url, String type);

}
