/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffeedecorator.dominio;

/**
 * Clase que representa el condimento de leche de soja como un decorador para una bebida.
 * Extiende la clase abstracta CondimentDecorator.
 * @author José Ángel Huerta Amparán
 */
public class SoyMilk extends CondimentDecorator {

    /**
     * Constructor que recibe una bebida y la envuelve con el decorador de leche de soja.
     * 
     * @param beverage La bebida a la que se le añadirá leche de soja.
     */
    public SoyMilk(Beverage beverage) {
        super(beverage);
    }

    /**
     * Devuelve la descripción de la bebida, incluyendo el condimento de leche de soja.
     * 
     * @return La descripción de la bebida con leche de soja añadida.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy milk";
    }

    /**
     * Devuelve el costo total de la bebida con el costo adicional de la leche de soja.
     * 
     * @return El costo total de la bebida con la leche de soja.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 5.00;
    }
}
