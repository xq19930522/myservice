package com.example.cloud.repository;
import com.example.cloud.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;




public interface UserRepository extends JpaRepository<User, Integer> {
    User findByPhoneNumber(String phone_number);

    User findByUsername(String username);

    User findByIdAndAndPassword(Integer id, String password);

    User findAllById(Integer id);



}
