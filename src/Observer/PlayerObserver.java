/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author juandev
 */
public class PlayerObserver implements Observer{

    
    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    
    @Override
    public void addSubscriber(Subscriber sub) {
        subscribers.add(sub);
        
    }

    @Override
    public void removeSubscriber(Subscriber sub) {
        subscribers.remove(sub);
    }
    
}
