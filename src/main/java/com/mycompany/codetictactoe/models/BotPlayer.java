/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codetictactoe.models;

/**
 *
 * @author EMF
 */
public class BotPlayer extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public BotPlayer(int id, PlayerType playerType, String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel){
        super(id, playerType, name, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
    }
    public BotDifficultyLevel getBotDifficultyLevel() { 
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
    
    
}
