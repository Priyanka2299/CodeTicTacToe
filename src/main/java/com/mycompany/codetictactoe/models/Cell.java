/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codetictactoe.models;

/**
 *
 * @author EMF
 */
public class Cell {
    private int row;
    private int col;
    private CellState cellState;
    private Symbol symbol;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
        this.symbol = null;
    }
    
    public void display(){
        if(cellState == CellState.EMPTY){
            System.out.print("| - |");
        }else if(cellState == CellState.FILLED{
            System.out.print("| - " + symbol.getCharSymbol() + " |");
        }
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
    
    
           
}
