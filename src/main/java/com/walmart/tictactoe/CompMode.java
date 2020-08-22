/*
 * Created on 25-Jun-2017 by amehra1
 *
 * Copyright (c) 2017 Walmart Inc. All Rights Reserved.
 */
package com.walmart.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CompMode implements GameType {

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

            // comp turn
            List<Integer> rc = getValidTurn(board, turns);
            if (rc == null)
                return null;
            Turn compt = new Turn(board.getPlayerB(), rc.get(0), rc.get(1));
            if (isvalidTurn(compt)) {
                Type t = compt.getPlayer().getMovetype() == 0 ? Type.O : Type.X;
                board.getMatrix().get(compt.getRow()).get(compt.getColumn()).setType(t);
                printBoard(board);
                if (checkWinner(board, t)) {
                    return compt.getPlayer();
                }

            }

        }
        // no one won
        return null;
    }

    private boolean isvalidTurn(Turn turn) {

        if ((turn.getPlayer().getName().equals("A") || turn.getPlayer().getName().equals("COMP"))
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

    private List<Integer> getValidTurn(Board b, List<Turn> turns) {

        Random r = new Random();
        int Low = 0;
        int High = 3;
        List<Integer> rc = null;
        while (true) {
            int row = r.nextInt(High - Low) + Low;
            int col = r.nextInt(High - Low) + Low;
            if (b.getMatrix().get(row).get(col).getType() == Type.E
                    && notPresentin(row, col, turns)) {
                rc = new ArrayList<Integer>();
                rc.add(row);
                rc.add(col);
                break;
            }

        }

        return rc;
    }

    private boolean notPresentin(int r, int c, List<Turn> turns) {

        for (Turn turn : turns) {
            if (turn.getRow() == r && turn.getColumn() == c)
                return false;
        }
        return true;
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
