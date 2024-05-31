package com.arupproject.arupproject.controller;

import org.springframework.web.bind.annotation.RestController;

import com.arupproject.arupproject.entity.Qustion;
import com.arupproject.arupproject.service.QustionServicelist;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;








@RestController
public class QustionController {

    @Autowired
    private QustionServicelist qustionServicelist;

    @CrossOrigin("*")
    @GetMapping("/allqustion")
    public List<Qustion> getallQustions() {
        return qustionServicelist.getQustion();
    }

    @PostMapping("/addqustion")
    public Qustion CreatQustion(@RequestBody Qustion qustion) {
        
        Qustion q2=qustionServicelist.creaQustion(qustion);
        
       return q2; 
    }
    

    @PutMapping("/updatequstion/{id}")
    public Qustion UpdateQustion(@PathVariable Integer id, @RequestBody Qustion qustion) {
        return qustionServicelist.updateQustion(qustion,id);

    }



    
    @SuppressWarnings("rawtypes")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        String st=qustionServicelist.delete(id);
        return new ResponseEntity<>(st,HttpStatus.OK);
    }
    
    

    @GetMapping("/path")
    public String testhello() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
                        .getPrincipal();
        String username = userDetails.getUsername();
        return username;
    }
    
    
    
    
    
}
