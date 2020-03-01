package com.example.cloud.service;
import com.example.cloud.bean.User;
import java.util.List;




public interface UserService {

    User insert(User user);

    void delete();

    String updatePassword(String password, String phoneNumber);

    void updateUsername(String username, String phoneNumber);

    List<User> queryAll();

    String selectuser(String username);

    String validLogin(String username, String password);

    User querybyid(Integer id);

    String updatePsw(String username, String password, String newpsw);





}
