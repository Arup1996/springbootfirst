package com.arupproject.arupproject.Responseplayload;



import java.util.List;

import com.arupproject.arupproject.entity.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class GameResponse {
    
    private int statusCode;
    private List<Game> game;
    private String message;
    
}
