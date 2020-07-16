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
class RoverCommand {
    String commands = null;
    enum CMD {
        LEFT, RIGHT, INVALID
    }
    public RoverCommand(){
       
    }
    public RoverCommand(String _commands){
        this.commands = _commands;
    }
    
    public CMD whatIsCommand(){
        if (this.commands.contains("R")){
            return CMD.RIGHT;
        }
        if (this.commands.contains("L")){
            return CMD.RIGHT;
        }
        return CMD.INVALID;
    }
    
    
}
