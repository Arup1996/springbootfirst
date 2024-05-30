package com.arupproject.arupproject.service;

import java.util.List;

import com.arupproject.arupproject.entity.Game;

public interface GameInterfcce {
    
    Game creatgame(Game game);

    List<Game> showGame();


    Game showGame(Integer id);

    Game UpdateGame(Game game,Integer id);




}
