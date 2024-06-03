package com.arupproject.arupproject.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.arupproject.arupproject.Responseplayload.GameResponse;
import com.arupproject.arupproject.entity.Game;
import com.arupproject.arupproject.service.GameService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
public class GameController {
   
    @Autowired
    private GameService gameService;


    @CrossOrigin("*")
    @PostMapping("/creat_game")
    public ResponseEntity<GameResponse> CreatGame(@RequestBody Game game) {
        
        Game g1 = gameService.creatgame(game);

        List<Game> gamList=new ArrayList<>();
        gamList.add(g1);

        GameResponse gr =new GameResponse();
        gr.setGame(gamList);
        gr.setStatusCode(200);
        gr.setMessage("sucess");
        
        return new ResponseEntity<GameResponse>(gr,HttpStatus.OK);
    }


    @CrossOrigin("*")
    @PutMapping("creat_game/{id}")
    public ResponseEntity<GameResponse> updategame(@PathVariable Integer id, @RequestBody Game game) {
       Game g1= gameService.UpdateGame(game, id);
       
       List<Game> gamList=new ArrayList<>();
        gamList.add(g1);

        GameResponse gr =new GameResponse();
        gr.setGame(gamList);
        gr.setStatusCode(200);
        gr.setMessage("sucess");
        
        return new ResponseEntity<GameResponse>(gr,HttpStatus.OK);

    }


    @CrossOrigin("*")
    @GetMapping("/get_game/{id}")
    public ResponseEntity<GameResponse> findallgame(@PathVariable Integer id) {

       Game g1=gameService.showGame(id);
       
       List<Game> gamList=new ArrayList<>();
        gamList.add(g1);

        GameResponse gr =new GameResponse();
        gr.setGame(gamList);
       if(g1 != null){
            gr.setStatusCode(200);
            gr.setMessage("sucess");
       }else{
            gr.setStatusCode(400);
            gr.setMessage("failed");
       }

       return new ResponseEntity<GameResponse>(gr,HttpStatus.OK);
       
        
    }

    @CrossOrigin("*")
    @GetMapping("/get_game")
    public ResponseEntity<GameResponse> getallgame() {
        List<Game> gamList =gameService.getallgame();
        GameResponse gr =new GameResponse();
        gr.setGame(gamList);
        gr.setStatusCode(200);
        gr.setMessage("sucess");
        
        return new ResponseEntity<GameResponse>(gr,HttpStatus.OK);
    }

        @CrossOrigin("*")
        @SuppressWarnings("rawtypes")
        @DeleteMapping("/delete_game/{id}")
        public ResponseEntity delete(@PathVariable Integer id) {
            String st=gameService.delete(id);
            return new ResponseEntity<>(st,HttpStatus.OK);
        }
    
    
    




    
    
}
