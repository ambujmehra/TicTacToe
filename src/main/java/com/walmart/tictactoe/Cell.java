/*
 * Created on 25-Jun-2017 by amehra1
 *
 * Copyright (c) 2017 Walmart Inc. All Rights Reserved.
 */
package com.walmart.tictactoe;

public class Cell {

    private Type type;

    public Cell() {
        this.type = Type.E;
    }

    public Cell(Type type) {

        this.type = type;
    }

    public Type getType() {

        return type;
    }

    public void setType(Type type) {

        this.type = type;
    }

}
