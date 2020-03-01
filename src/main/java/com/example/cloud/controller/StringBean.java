package com.example.cloud.controller;

/**
 * Created by enlogty on 2017/12/9.
 *
 *
 *
 */

public class StringBean {
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "StringBean{" +
                "content='" + content + '\'' +
                '}';
    }

    private String content;
}
