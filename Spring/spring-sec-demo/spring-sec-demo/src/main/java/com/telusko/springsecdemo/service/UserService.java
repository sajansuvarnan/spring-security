package com.telusko.springsecdemo.service;

import com.telusko.springsecdemo.dao.UserRepo;
import com.telusko.springsecdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder  = new BCryptPasswordEncoder(12);


    public User saveUser(User user) {

        //encoding the password registered
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }
}
