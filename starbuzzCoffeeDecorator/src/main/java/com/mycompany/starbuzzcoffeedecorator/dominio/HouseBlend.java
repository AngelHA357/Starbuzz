/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffeedecorator.dominio;

/**
 * Clase que representa una bebida específica llamada House Blend.
 * Implementa la interfaz Beverage.
 * @author José Ángel Huerta Amparán
 */
public class HouseBlend implements Beverage {

    /**
     * Devuelve la descripción de la bebida.
     * 
     * @return La descripción de "House Blend".
     */
    @Override
    public String getDescription() {
        return "House Blend";
    }

    /**
     * Devuelve el costo de la bebida House Blend.
     * 
     * @return El costo de 38.0.
     */
    @Override
    public double getCost() {
        return 38.0;
    }
}
