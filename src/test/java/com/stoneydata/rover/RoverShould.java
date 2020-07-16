/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoneydata.rover;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author HoHill
 */
@RunWith(JUnitParamsRunner.class)
public class RoverShould {
    Rover rover  = null;
    
    public RoverShould() {}
    
    @Before
    public void setUp() {    
        rover = new Rover("0:0:N");;
    }
    
    @After
    public void tearDown() {
        rover = null;
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     @Parameters({
         "R,0:0:E",
         "R R,0:0:S",
         "R L L,0:0:W"
     })
     public void 
     rotate_right(String commands,String position) {
         assertThat(rover.execute(commands), is(position));
     }
}
