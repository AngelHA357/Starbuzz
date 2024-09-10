/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffeedecorator.dominio;

/**
 * Clase que representa el condimento de leche como un decorador para una bebida.
 * Extiende la clase abstracta CondimentDecorator.
 * @author José Ángel Huerta Amparán
 */
public class Milk extends CondimentDecorator {

    /**
     * Constructor que recibe una bebida y la envuelve con el decorador de leche.
     * 
     * @param beverage La bebida a la que se le añadirá leche.
     */
    public Milk(Beverage beverage) {
        super(beverage);
    }

    /**
     * Devuelve la descripción de la bebida, incluyendo el condimento de leche.
     * 
     * @return La descripción de la bebida con leche añadida.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    /**
     * Devuelve el costo total de la bebida con el costo adicional de la leche.
     * 
     * @return El costo total de la bebida con la leche.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 5.00;
    }
}
