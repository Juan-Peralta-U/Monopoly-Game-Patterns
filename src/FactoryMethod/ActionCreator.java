package FactoryMethod;

import Composite.Square;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juandev
 */
public abstract class ActionCreator {
    
    public abstract Square createProduct(int xCoord, int yCoord, int width, int height, String labelString, int rotationDegrees);
    
}
