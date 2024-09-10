/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffeedecorator.dominio;

/**
 * Interfaz que define lo que deben tener las bebidas
 * @author José Ángel Huerta Amparán
 */
public interface Beverage {

    /**
     * Devuelve una descripción de la bebida.
     *
     * @return Una cadena que describe la bebida.
     */
    public String getDescription();

    /**
     * Devuelve el costo de la bebida.
     *
     * @return El costo de la bebida como un valor double.
     */
    public double getCost();

}
