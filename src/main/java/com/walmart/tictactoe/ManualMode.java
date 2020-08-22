/*
 * Created on 25-Jun-2017 by amehra1
 *
 * Copyright (c) 2017 Walmart Inc. All Rights Reserved.
 */
package com.walmart.tictactoe;

import java.util.List;

public class ManualMode implements GameType {

    public Player play(Board board, List<Turn> turns) {

        for (Turn turn : turns) {
            Player p = turn.getPlayer();
            if (isvalidTurn(turn)) {
                Type t = p.getMovetype() == 0 ? Type.O : Type.X;
                board.getMatrix().get(turn.getRow()).get(turn.getColumn()).setType(t);
                printBoard(board);
                if (checkWinner(board, t)) {
                    return p;
                }
            }
        }
        // no one won
        return null;
    }

    private boolean isvalidTurn(Turn turn) {

        if ((turn.getPlayer().getName().equals("A") || turn.getPlayer().getName().equals("B"))
                && turn.getRow() <= 2 && turn.getColumn() <= 2) {
            return true;

        }
        return false;
    }

    private boolean checkWinner(Board board, Type t) {

        List<List<Cell>> matrix = board.getMatrix();
        if (matrix.get(0).get(0).getType() == t && matrix.get(0).get(1).getType() == t
                && matrix.get(0).get(2).getType() == t)
            return true;

        else if (matrix.get(1).get(0).getType() == t && matrix.get(1).get(1).getType() == t
                && matrix.get(1).get(2).getType() == t)
            return true;

        else if (matrix.get(2).get(0).getType() == t && matrix.get(2).get(1).getType() == t
                && matrix.get(2).get(2).getType() == t)
            return true;
        else if (matrix.get(0).get(0).getType() == t && matrix.get(0).get(1).getType() == t
                && matrix.get(0).get(2).getType() == t)
            return true;
        else if (matrix.get(1).get(0).getType() == t && matrix.get(1).get(1).getType() == t
                && matrix.get(1).get(2).getType() == t)
            return true;
        else if (matrix.get(2).get(0).getType() == t && matrix.get(2).get(1).getType() == t
                && matrix.get(2).get(2).getType() == t)
            return true;
        else if (matrix.get(0).get(0).getType() == t && matrix.get(1).get(1).getType() == t
                && matrix.get(2).get(2).getType() == t)
            return true;
        else if (matrix.get(2).get(0).getType() == t && matrix.get(1).get(1).getType() == t
                && matrix.get(0).get(2).getType() == t)
            return true;

        return false;
    }

    void printBoard(Board board) {

        List<List<Cell>> matrix = board.getMatrix();
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j).getType() + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
