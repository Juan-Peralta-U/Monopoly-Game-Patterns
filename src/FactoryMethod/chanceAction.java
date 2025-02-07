/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import gui.Player;
import java.util.Random;
/**
 *
 * @author juandev
 */
public class chanceAction implements Action{

    @Override
    public void playerAction(Player player) {
        
        System.out.println("Chance action");
        
        Random rand = new Random();
        
        int amount = rand.nextInt(1, 5);
        
        if(amount < 4){
            player.depositToWallet(amount*100);
            return;
        }
        
        player.doubleDiceForPlayer = true;
       
    }
    
}
