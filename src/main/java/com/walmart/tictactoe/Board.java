/*
 * Created on 25-Jun-2017 by amehra1
 *
 * Copyright (c) 2017 Walmart Inc. All Rights Reserved.
 */
package com.walmart.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int size;
    private List<List<Cell>> matrix;
    private Player playerA;
    private Player playerB;

    public static class Builder {

        private int size;
        private List<List<Cell>> matrix;
        private Player playerA;
        private Player playerB;

        public Builder setSize(int size) {

            this.size = size;
            return this;
        }

        public Builder setMatrix() {

            matrix = new ArrayList<List<Cell>>();
            for (int i = 0; i < size; i++) {

                List<Cell> row = new ArrayList<Cell>();
                for (int j = 0; j < size; j++) {
                    row.add(new Cell(Type.E));
                }

                matrix.add(row);
            }
            return this;
        }

        public Builder setPlayerA(Player A) {

            this.playerA = A;
            return this;
        }

        public Builder setPlayerB(Player B) {

            this.playerB = B;
            return this;
        }

        public Board build() {

            return new Board(this);
        }
    }

    private Board(Builder builder) {
        this.size = builder.size;
        this.matrix = builder.matrix;
        this.playerA = builder.playerA;
        this.playerB = builder.playerB;

    }

    public int getSize() {

        return size;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public List<List<Cell>> getMatrix() {

        return matrix;
    }

    public void setMatrix(List<List<Cell>> matrix) {

        this.matrix = matrix;
    }

    public Player getPlayerA() {

        return playerA;
    }

    public void setPlayerA(Player playerA) {

        this.playerA = playerA;
    }

    public Player getPlayerB() {

        return playerB;
    }

    public void setPlayerB(Player playerB) {

        this.playerB = playerB;
    }

}
