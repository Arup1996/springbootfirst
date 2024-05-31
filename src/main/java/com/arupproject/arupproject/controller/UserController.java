package com.arupproject.arupproject.controller;

import org.springframework.web.bind.annotation.RestController;

import com.arupproject.arupproject.Responseplayload.UserResponse;
import com.arupproject.arupproject.entity.User;
import com.arupproject.arupproject.serviceimpl.Userserviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    @Autowired
    private Userserviceimp userserviceimp;

    @PostMapping("/user_creat")
    public ResponseEntity<UserResponse> creatUser(@RequestBody User user) {
        User u1= userserviceimp.creatuser(user);
        UserResponse response =new UserResponse();
        response.setStatuscode(200);
        response.setMessage("sucess");
        response.setUser(u1);;
        return new ResponseEntity<UserResponse>(response,HttpStatus.OK);

    }
    
    
}
