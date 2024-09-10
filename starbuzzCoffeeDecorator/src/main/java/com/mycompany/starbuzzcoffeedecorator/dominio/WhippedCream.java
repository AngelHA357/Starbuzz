/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffeedecorator.dominio;

/**
 * Clase que representa el condimento de crema batida como un decorador para una bebida.
 * Extiende la clase abstracta CondimentDecorator.
 * @author José Ángel Huerta Amparán
 */
public class WhippedCream extends CondimentDecorator {

    /**
     * Constructor que recibe una bebida y la envuelve con el decorador de crema batida.
     * 
     * @param beverage La bebida a la que se le añadirá crema batida.
     */
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    /**
     * Devuelve la descripción de la bebida, incluyendo el condimento de crema batida.
     * 
     * @return La descripción de la bebida con crema batida añadida.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whipped cream";
    }

    /**
     * Devuelve el costo total de la bebida con el costo adicional de la crema batida.
     * 
     * @return El costo total de la bebida con la crema batida.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 5.00;
    }
}
