/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author Cesar
 */
public class BoardException extends RuntimeException {
    private static final long serialVersionUI = 1L;
    
    
    public BoardException(String msg){
        super(msg);
    }
}
