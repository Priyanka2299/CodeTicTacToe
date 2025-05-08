/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codetictactoe.controllers;

import com.mycompany.codetictactoe.models.Game;
import com.mycompany.codetictactoe.models.GameState;
import com.mycompany.codetictactoe.models.Player;
import com.mycompany.codetictactoe.strategies.WinningStrategy;
import java.util.List;

public class GameController {
    //private Game game;
    public Game startGame(
            int dimension,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){
        return Game
                .getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }
    public void display(Game game){
        game.display();
    }
    public void makeMove(Game game){
        
    }
    public GameState checkState(Game game){
        return GameState.IN_PROGRESS;
    }
    public void undo(Game game){
        
    }
    public Player getWinner(Game game){
        return null;
    }




}
