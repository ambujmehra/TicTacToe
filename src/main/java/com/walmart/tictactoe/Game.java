/*
 * Created on 25-Jun-2017 by amehra1
 *
 * Copyright (c) 2017 Walmart Inc. All Rights Reserved.
 */
package com.walmart.tictactoe;

import java.util.List;

public class Game {

    private GameType game;

    public void startGame(int size, String Mode, List<Turn> turns, Player A, Player B) {

        Board board =
                new Board.Builder().setSize(size).setMatrix().setPlayerA(A).setPlayerB(B).build();
        printBoard(board);
        if (Mode.equals("HUMAN-HUMAN")) {
            game = new ManualMode();
            Player winner = game.play(board, turns);
            if (winner == null) {
                System.out.println("No winner");
            } else {
                System.out.println("Winner " + winner.getName() + " " + winner.getMovetype());
            }
        } else if (Mode.equals("HUMAN-COMP")) {
            game = new CompMode();
            Player winner = game.play(board, turns);
            if (winner == null) {
                System.out.println("No winner");
            } else {
                System.out.println("Winner " + winner.getName() + " " + winner.getMovetype());
            }
        }

    }

    void printBoard(Board board) {

        System.out.println("--------Players------------");
        System.out.println(
                "Player " + board.getPlayerA().getName() + " " + board.getPlayerA().getMovetype());
        System.out.println(
                "Player " + board.getPlayerB().getName() + " " + board.getPlayerB().getMovetype());

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
