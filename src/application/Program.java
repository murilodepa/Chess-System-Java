/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import boardGame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;

/**
 *
 * @author Murilo Araujo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UserInterface.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UserInterface.readChessPosition(sc);
            
            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UserInterface.readChessPosition(sc);
     
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            
        }
    }

}
