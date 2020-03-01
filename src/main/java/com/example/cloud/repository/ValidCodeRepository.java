package com.example.cloud.repository;

import com.example.cloud.bean.ValidCode;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ValidCodeRepository extends JpaRepository<ValidCode, Integer> {
}
