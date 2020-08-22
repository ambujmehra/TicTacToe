/*
 * Created on 25-Jun-2017 by amehra1
 *
 * Copyright (c) 2017 Walmart Inc. All Rights Reserved.
 */
package com.walmart.tictactoe;

import java.util.List;

public interface GameType {

    public Player play(Board board, List<Turn> turns);

}
