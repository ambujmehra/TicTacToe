/*
 * Created on 25-Jun-2017 by amehra1
 *
 * Copyright (c) 2017 Walmart Inc. All Rights Reserved.
 */
package com.walmart.tictactoe;

public class Turn {

    private Player player;
    private int row;
    private int column;

    public Turn(Player player, int row, int column) {
        this.player = player;
        this.row = row;
        this.column = column;
    }

    public Player getPlayer() {

        return player;
    }

    public void setPlayer(Player player) {

        this.player = player;
    }

    public int getRow() {

        return row;
    }

    public void setRow(int row) {

        this.row = row;
    }

    public int getColumn() {

        return column;
    }

    public void setColumn(int column) {

        this.column = column;
    }

}
