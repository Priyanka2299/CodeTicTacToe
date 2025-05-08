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
            int size,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){
        return Game(size, players, winningStrategies);
                
    public void display(Game game){
        game.display();
    }
    public void makeMove(Game game){
        game.makeMove();
    }
    
    public GameState getGameState(Game game){
        return game.getGameState();
    }
    public void undo(Game game){
        game.undo();
    }
    public Player getWinner(Game game){
        return game.getWinner();
    }




}
