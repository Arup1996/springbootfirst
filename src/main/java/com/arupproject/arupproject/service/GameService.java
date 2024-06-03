package com.arupproject.arupproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arupproject.arupproject.entity.Game;
import com.arupproject.arupproject.repository.GameRepo;

@Service
public class GameService implements GameInterfcce {
    
    @Autowired
    private GameRepo gameRepo;


    @Override
    public List<Game> showGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showGame'");
    }

    @Override
    public Game showGame(Integer id) {
        Optional<Game> g1 =gameRepo.findById(id);
        if(g1.isPresent()){
            Game g2 =g1.get();
            return g2;
        }
        return null;
    }

    public List<Game> getallgame(){
        List<Game> list =gameRepo.findAll();
        return list;
    }


    @Override
    public Game creatgame(Game game) {
        Game g1 =gameRepo.save(game);
        return g1;
    }

    @Override
    public Game UpdateGame(Game game, Integer id) {
        Optional<Game> g1 =gameRepo.findById(id);
        if(g1.isPresent()){
            Game g2 =g1.get();
            g2.setGames_category(game.getGames_category());
            g2.setGames_dev(game.getGames_dev());
            g2.setGames_name(game.getGames_name());
            g2.setGames_year(game.getGames_year());
            g2.setGames_image(game.getGames_image());
            Game g3 =gameRepo.save(g2);
            return g3;
        }
        return null;
    }

    public String delete(Integer id) {
        gameRepo.deleteById(id);
        return "delete success";
    } 
    
}
