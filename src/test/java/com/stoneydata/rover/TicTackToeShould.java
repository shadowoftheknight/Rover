/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoneydata.rover;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HoHill
 */
public class TicTackToeShould {
    
    public TicTackToeShould() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void firstPlayerShouldBeX() {
         Ticktactoe ticktactoe = new Ticktactoe();
         String playerName = ticktactoe.getCurrentPlayer();
         
         assertTrue(playerName.equals("X"));
     }
     
     @Test
     public void secondPlayerShouldBeO() {
         Ticktactoe ticktactoe = new Ticktactoe();
         ticktactoe.move();
         String playerName = ticktactoe.getCurrentPlayer();
         
         assertTrue(playerName.equals("O"));
     }

     @Test
     public void playerAlternate() {
         Ticktactoe ticktactoe = new Ticktactoe();
         ticktactoe.move();
         String playerName = ticktactoe.getCurrentPlayer();
         assertTrue(playerName.equals("O"));
         ticktactoe.move();
         playerName = ticktactoe.getCurrentPlayer();
         assertTrue(playerName.equals("X"));
     }
     
     @Test
     public void horizontal_win(){
         Ticktactoe ticktactoe = new Ticktactoe();
         ticktactoe.move(3);//X
         ticktactoe.move(0);//O
         ticktactoe.move(4);//X
         ticktactoe.move(1);//O
         ticktactoe.move(5);//X
         
         String playerName = ticktactoe.getWinner();
         assertTrue(playerName.equals("X"));
     }
   
}
