package com.arupproject.arupproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arupproject.arupproject.entity.Game;

public interface GameRepo extends JpaRepository<Game,Integer> {

    
} 
