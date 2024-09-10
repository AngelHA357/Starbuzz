/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffeedecorator.dominio;

/**
 * Clase que representa una bebida específica llamada Dark Roast.
 * Implementa la interfaz Beverage.
 * @author José Ángel Huerta Amparán
 */
public class DarkRoast implements Beverage {

    /**
     * Devuelve la descripción de la bebida.
     * 
     * @return La descripción de "Dark Roast".
     */
    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    /**
     * Devuelve el costo de la bebida Dark Roast.
     * 
     * @return El costo de 45.0.
     */
    @Override
    public double getCost() {
        return 45.0;
    }
}
