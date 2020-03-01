package com.example.cloud.repository;


import com.example.cloud.bean.Sms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmsRepository extends JpaRepository<Sms, Integer> {


}
