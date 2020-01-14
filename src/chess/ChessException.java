/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boardGame.BoardException;

/**
 *
 * @author Murilo Araujo
 */
public class ChessException extends BoardException{
    
    public ChessException(String msg) {
        super(msg);
    }
}
