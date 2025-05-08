/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codetictactoe.models;

public class HumanPlayer extends Player{
    public HumanPlayer(int id, PlayerType playerType, String name, Symbol symbol){
            //calling super coz id and all other attributes are private cannot call this.id = id
            super(id, playerType, name, symbol);
    }
}
