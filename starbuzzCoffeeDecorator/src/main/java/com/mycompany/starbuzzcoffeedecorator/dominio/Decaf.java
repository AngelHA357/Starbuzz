/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffeedecorator.dominio;

/**
 * Clase que representa una bebida específica llamada Decaf (descafeinado).
 * Implementa la interfaz Beverage.
 * @author José Ángel Huerta Amparán
 */
public class Decaf implements Beverage {

    /**
     * Devuelve la descripción de la bebida.
     * 
     * @return La descripción de "Decaf".
     */
    @Override
    public String getDescription() {
        return "Decaf";
    }

    /**
     * Devuelve el costo de la bebida Decaf.
     * 
     * @return El costo de 30.0.
     */
    @Override
    public double getCost() {
        return 30.0;
    }
}
