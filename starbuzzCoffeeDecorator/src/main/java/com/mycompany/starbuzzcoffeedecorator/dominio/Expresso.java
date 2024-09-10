  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffeedecorator.dominio;
/**
 * Clase que representa una bebida específica llamada Expresso.
 * Implementa la interfaz Beverage.
 * @author José Ángel Huerta Amparán
 */
public class Expresso implements Beverage {

    /**
     * Devuelve la descripción de la bebida.
     * 
     * @return La descripción de "Expresso".
     */
    @Override
    public String getDescription() {
        return "Expresso";
    }

    /**
     * Devuelve el costo de la bebida Expresso.
     * 
     * @return El costo de 36.0.
     */
    @Override
    public double getCost() {
        return 36.0;
    }
}