package Observer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author juandev
 */
public interface Observer {
    
    public void addSubscriber(Subscriber sub);
    public void removeSubscriber(Subscriber sub);
    
}
