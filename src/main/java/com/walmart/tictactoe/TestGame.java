/*
 * Created on 25-Jun-2017 by amehra1
 *
 * Copyright (c) 2017 Walmart Inc. All Rights Reserved.
 */
package com.walmart.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class TestGame {

    private final static String humanMode = "HUMAN-HUMAN";
    private final static String compMode = "HUMAN-COMP";

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("+++++++++++++Test HUMAN-HUMAN+++++++++++++");
        Player A = new Player("A", 0);
        Player B = new Player("B", 1);
        Game game = new Game();
        // System.out.println(A.getMovetype());
        List<Turn> listOfTurn = new ArrayList<Turn>();
        listOfTurn.add(new Turn(A, 0, 1));
        listOfTurn.add(new Turn(B, 2, 2));
        listOfTurn.add(new Turn(A, 2, 0));
        listOfTurn.add(new Turn(B, 1, 0));
        listOfTurn.add(new Turn(A, 0, 2));
        listOfTurn.add(new Turn(B, 0, 0));
        listOfTurn.add(new Turn(A, 1, 1));
        listOfTurn.add(new Turn(B, 1, 2));

        game.startGame(3, humanMode, listOfTurn, A, B);

        System.out.println("+++++++++++++Test HUMAN-COMP++++++++++++++");
        Player A1 = new Player("A", 1);
        Player B1 = new Player("COMP", 0);
        Game game1 = new Game();
        // System.out.println(A.getMovetype());
        List<Turn> listOfTurn1 = new ArrayList<Turn>();
        listOfTurn1.add(new Turn(A1, 0, 1));
        listOfTurn1.add(new Turn(A1, 2, 0));
        listOfTurn1.add(new Turn(A1, 0, 2));
        listOfTurn1.add(new Turn(A1, 1, 1));

        game1.startGame(3, compMode, listOfTurn1, A1, B1);
    }

}
