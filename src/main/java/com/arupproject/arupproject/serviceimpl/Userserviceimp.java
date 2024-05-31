package com.arupproject.arupproject.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.arupproject.arupproject.entity.User;
import com.arupproject.arupproject.repository.UserRepo;
import com.arupproject.arupproject.service.UserService;


@Service
public class Userserviceimp implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User creatuser(User user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        User u1=userRepo.save(user);
        u1.setPassword("");
        return u1;
    }



    @Override
    public User Updateuser(User user, Integer Id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Updateuser'");
    }
    
}
