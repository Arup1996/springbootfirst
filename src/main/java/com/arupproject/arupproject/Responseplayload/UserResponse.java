package com.arupproject.arupproject.Responseplayload;

import com.arupproject.arupproject.entity.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserResponse {

   private Integer statuscode;

   private User user;

   private String message;
    
}
