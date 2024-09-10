/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starbuzzcoffeedecorator.dominio;

/**
 *
 * Clase abstracta que actúa como un decorador para bebidas, implementando la interfaz Beverage.
 * Los decoradores concretos (como Chocolate) extienden esta clase para añadir funcionalidad.
 * @author José Ángel Huerta Amparán
 */
public class CondimentDecorator implements Beverage {

    /**
     * La bebida que será decorada con un condimento.
     */
    protected Beverage beverage;

    /**
     * Constructor que inicializa el decorador con una bebida.
     *
     * @param beverage La bebida que será envuelta por el decorador.
     */
    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Devuelve la descripción de la bebida decorada.
     *
     * @return La descripción de la bebida.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    /**
     * Devuelve el costo de la bebida decorada.
     *
     * @return El costo de la bebida.
     */
    @Override
    public double getCost() {
        return beverage.getCost();
    }
}
