/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import gui.Player;
import java.util.ArrayList;

/**
 *
 * @author juandev
 */
public class PlayerObserver {

    
    private Player player;
    private ArrayList<PlayerSubscriber> subscribers = new ArrayList<>();
    
    
    public void setPlayer(Player player){
        this.player = player;
    }
    
    public void addSubscriber(PlayerSubscriber sub) {
        subscribers.add(sub);
        
    }

    public void removeSubscriber(PlayerSubscriber sub) {
        subscribers.remove(sub);
    }

    public void updateSubscriber() {
        for(PlayerSubscriber subscriber : subscribers){
            subscriber.update(player);
        }
        
    }
    
}
