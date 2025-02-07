/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import gui.Player;

/**
 *
 * @author juandev
 */
public class rollAgainAction implements Action{

    @Override
    public void playerAction(Player player) {
        player.doubleDiceForPlayer = true;
        System.out.println("Roll Again action");
    }
    
}
