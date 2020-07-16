/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoneydata.rover;

/**
 *
 * @author HoHill
 */
public class Ticktactoe {
    String currentPlayer = "X";
    
    String getCurrentPlayer() {
      return currentPlayer;
    }
    
    void move(){
        move(0);
    }

    void move(int move) {
     if( currentPlayer.equals("X")){
         currentPlayer = "O";         
     }else{
         currentPlayer = "X";
     }
     
    }

    String getWinner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
