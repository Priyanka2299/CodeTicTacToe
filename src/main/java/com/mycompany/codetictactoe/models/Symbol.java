/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codetictactoe.models;

/**
 *
 * @author EMF
 */
public class Symbol {
    private char charSymbol;
    private String color;
    
    public Symbol(char charSymbol, String color){
        this.charSymbol = charSymbol;
        this.color = color;
    }

    public char getCharSymbol() {
        return charSymbol;
    }

    public void setCharSymbol(char charSymbol) {
        this.charSymbol = charSymbol;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
