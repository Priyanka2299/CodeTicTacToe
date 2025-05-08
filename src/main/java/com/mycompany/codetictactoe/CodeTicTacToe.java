/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.codetictactoe;

import com.mycompany.codetictactoe.controllers.GameController;
import com.mycompany.codetictactoe.models.BotDifficultyLevel;
import com.mycompany.codetictactoe.models.BotPlayer;
import com.mycompany.codetictactoe.models.GameState;
import com.mycompany.codetictactoe.models.Game;
import com.mycompany.codetictactoe.models.HumanPlayer;
import com.mycompany.codetictactoe.models.Player;
import com.mycompany.codetictactoe.models.PlayerType;
import com.mycompany.codetictactoe.models.Symbol;
import com.mycompany.codetictactoe.strategies.WinningStrategy;
import java.util.ArrayList;
import java.util.List;

public class CodeTicTacToe {
    public static void main(String[] args) {
        //Gamecontroller
        GameController gameController = new GameController();
        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer(1, PlayerType.HUMAN, "Priyanka", new Symbol('x', "Green")));
        players.add(new BotPlayer(1, PlayerType.BOT, "Bot 1", new Symbol('x', "Green"), BotDifficultyLevel.EASY));
        
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        Game game = gameController.startGame(3, players, winningStrategies);
        
        gameController.display(game);
        
        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)){
            gameController.makeMove(game);
            gameController.display(game);
        }
        if(gameController.checkState(game).equals(GameState.SUCCESS)){
            System.out.println("Winner is " + gameController.getWinner(game));
        }else if (gameController.checkState(game).equals(GameState.DRAW)){
            System.out.println("Game ends in a DRAW!");
        }
    
    
    }
}
