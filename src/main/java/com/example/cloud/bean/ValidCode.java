package com.example.cloud.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ValidCode {
    public ValidCode() {
    }

    @Id
    @GeneratedValue
    private Integer id;
    private Integer validCode;

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    private String phonenumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getValidCode() {
        return validCode;
    }

    public void setValidCode(Integer validCode) {
        this.validCode = validCode;
    }

    @Override
    public String toString() {
        return "ValidCode{" +
                "id=" + id +
                ", validCode=" + validCode +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
