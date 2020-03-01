package com.example.cloud.controller;

import com.example.cloud.bean.CloudImage;
import com.example.cloud.service.CloudImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/image")
public class CloudImageController {

    @Autowired
    private CloudImageService service;

    @GetMapping(value = "/findall")
    public List<CloudImage> findAll() {
        return service.findAll();
    }

    @PostMapping(value = "/insert")
    public CloudImage insert(@RequestParam(value = "mynumber") String localNumber, @RequestParam(value = "path") String path, @RequestParam(value = "url") String url, @RequestParam(value = "type") String type) {
        return service.insert(localNumber, path, url, type);
    }



}
