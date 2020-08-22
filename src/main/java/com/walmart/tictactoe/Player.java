/*
 * Created on 25-Jun-2017 by amehra1
 *
 * Copyright (c) 2017 Walmart Inc. All Rights Reserved.
 */
package com.walmart.tictactoe;

public class Player {

    private String name;
    private int movetype;

    // 0 = O 1=X
    public Player(String name, int movetype) {
        this.name = name;
        this.movetype = movetype;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getMovetype() {

        return movetype;
    }

    public void setMovetype(int movetype) {

        this.movetype = movetype;
    }

}
