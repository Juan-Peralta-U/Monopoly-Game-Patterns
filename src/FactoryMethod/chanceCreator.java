/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import Composite.Square;

/**
 *
 * @author juandev
 */
public class chanceCreator extends ActionCreator{

    @Override
    public Action createProduct() {
        return new chanceAction();
    }

    
}
