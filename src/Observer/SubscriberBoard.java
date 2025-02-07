/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import Composite.Square;
import gui.Board;
import gui.Player;

/**
 *
 * @author juandev
 */
public class SubscriberBoard implements PlayerSubscriber{

    private Board gameBoard;
  
    public void setBoard(Board gameBoard){
        this.gameBoard = gameBoard;
    }
    
    @Override
    public void update(Player player) {
        
        System.out.println("Sub board");
        
        Square currentSquare = gameBoard.getAllSquares().get(player.getCurrentSquareNumber());
        
        int withdrawAmount = currentSquare.getPrice();
	player.withdrawFromWallet(withdrawAmount);
        
        currentSquare.playerAction(player);
    }
    
}
