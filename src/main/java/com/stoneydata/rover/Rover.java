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
public class Rover {

    String direction = null;

    public Rover() {
    }

    public Rover(String _direction) {
        this.direction = _direction;
    }

    String execute(String commands) {
        String[] cmds = commands.split(" ");
        for (String cmd : cmds) {
            RoverCommand rc = validate(cmd);
            switch (rc.whatIsCommand()) {

                case LEFT:
                    changeDirectionLeft();
                case RIGHT:

                    changeDirectionRight();
                case INVALID:
                    break;

            }
        }

        return this.direction;
    }

    RoverCommand validate(String commands) {
        if (null == commands) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        return new RoverCommand(commands);
    }

    private void changeDirectionRight() {
        if (direction.contains(":N")) {
            this.direction = direction.replace(":N", ":E");
        } else if (direction.contains(":E")) {
            direction = direction.replace(":E", ":S");
        } else if (direction.contains(":S")) {
            direction = direction.replace(":S", ":W");
        } else if (direction.contains(":W")) {
            direction = direction.replace(":W", ":N");
        }

    }

    private void changeDirectionLeft() {

        if (direction.contains(":N")) {
            direction = direction.replace(":N", ":W");
        } else if (direction.contains(":W")) {
            direction = direction.replace(":W", ":S");
        } else if (direction.contains(":S")) {
            direction = direction.replace(":S", ":E");
        } else if (direction.contains(":E")) {
            direction = direction.replace(":E", ":N");
        }

    }
}
