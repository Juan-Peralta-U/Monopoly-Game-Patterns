/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

import java.awt.List;
import java.util.ArrayList;




/**
 *
 * @author jhona
 */
public class Group_Property implements Component{
    
    private String color;
    private ArrayList<Component> propiedades;
    

    public Group_Property(String color) {
        this.propiedades = new ArrayList<>();
        this.color = color;
    }
    
    public void agregarPropiedad(Component propiedad) {
        propiedades.add(propiedad);
    }
    


    @Override
    public int getPrice() {
        int total=0;
        for (Component propiedad : propiedades) {
            total += propiedad.getPrice();  // Suma los precios de las propiedades
        }
        return total;
    }


    @Override
    public int getRentPrice() {
       int total=0;
        for (Component propiedad : propiedades) {
            total += propiedad.getRentPrice();  // Suma los precios de las propiedades
        }
        return total;
    }

    @Override
    public String getName() {
        for (Component propiedad : propiedades) {
            propiedad.getName();  // Llamada recursiva a cada propiedad
        }
        return null;
    }

    
    
}
