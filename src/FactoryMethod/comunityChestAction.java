/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import Composite.Square;
import gui.Player;

/**
 *
 * @author juandev
 */
public class comunityChestAction implements Action {

    @Override
    public void playerAction(Player player) {
        player.depositToWallet(300);
        System.out.println("Chest action");

    }
    
}
