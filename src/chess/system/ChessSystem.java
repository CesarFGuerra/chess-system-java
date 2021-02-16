/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.system;

import chess.ChessMatch;

/**
 *
 * @author Cesar
 */
public class ChessSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      ChessMatch chessMatch = new ChessMatch();
      UI.printBoard(chessMatch.getPieces());
        // TODO code application logic here
    }
    
}
