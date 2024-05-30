package com.arupproject.arupproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arupproject.arupproject.entity.User;

public interface UserRepo extends JpaRepository<User,Integer> {
    
}
