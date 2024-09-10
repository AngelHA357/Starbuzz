/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffeedecorator.dominio;

/**
 * Clase que representa el condimento de chocolate como un decorador para una
 * bebida. Extiende la clase abstracta CondimentDecorator.
 *
 * @author José Ángel Huerta Amparán
 */
public class Chocolate extends CondimentDecorator {

    /**
     * Constructor que recibe una bebida y la envuelve con el decorador de
     * chocolate.
     *
     * @param beverage La bebida a la que se le añadirá chocolate.
     */
    public Chocolate(Beverage beverage) {
        super(beverage);
    }

    /**
     * Devuelve la descripción de la bebida, incluyendo el condimento de
     * chocolate.
     *
     * @return La descripción de la bebida con chocolate añadido.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", chocolate";
    }

    /**
     * Devuelve el costo total de la bebida con el costo adicional del
     * chocolate.
     *
     * @return El costo total de la bebida con el chocolate.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 5.00;
    }
}
