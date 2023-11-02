package com.example.modelsdao.dao;

import com.example.modelsdao.model.GameModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

    @Component
    public class GameDAO {

        private static int GAME_COUNT;
        private List<GameModel> game;
        {
            game = new ArrayList<>();

            game.add(new GameModel(++GAME_COUNT,"Fortnite","BattleRoyal", "нет","Нет"));
            game.add(new GameModel(++GAME_COUNT,"GTA5","Криминал", "нет","Да"));
            game.add(new GameModel(++GAME_COUNT,"Cyberpunk","Боевик", "более-менее","Да"));
            game.add(new GameModel(++GAME_COUNT,"GTA6","Криминал", "да","Да"));
        }

        public List<GameModel> index(){

            return game;
        }

        public GameModel show(int id){
            return game.stream().filter(gameModel -> gameModel.getId() == id).findAny().orElse(null);
        }

        public void save(GameModel gam){
            gam.setId(++GAME_COUNT);
            game.add(gam);
        }

        public void update(int id, GameModel gameModel){
            GameModel updateGame = show(id);
            updateGame.setName(gameModel.getName());
            updateGame.setJanr(gameModel.getJanr());
            updateGame.setNovinka(gameModel.getNovinka());
            updateGame.setPlata(gameModel.getPlata());
        }


        public void delete(int id){
            game.removeIf(p-> p.getId() == id);
        }

    }
