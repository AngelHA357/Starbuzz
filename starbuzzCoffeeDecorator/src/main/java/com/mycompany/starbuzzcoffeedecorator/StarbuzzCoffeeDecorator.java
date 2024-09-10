/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.starbuzzcoffeedecorator;

import com.mycompany.starbuzzcoffeedecorator.dominio.Beverage;
import com.mycompany.starbuzzcoffeedecorator.dominio.Chocolate;
import com.mycompany.starbuzzcoffeedecorator.dominio.DarkRoast;
import com.mycompany.starbuzzcoffeedecorator.dominio.Decaf;
import com.mycompany.starbuzzcoffeedecorator.dominio.Expresso;
import com.mycompany.starbuzzcoffeedecorator.dominio.HouseBlend;
import com.mycompany.starbuzzcoffeedecorator.dominio.Milk;
import com.mycompany.starbuzzcoffeedecorator.dominio.SoyMilk;
import com.mycompany.starbuzzcoffeedecorator.dominio.WhippedCream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Clase principal para gestionar un pedido de café con diferentes opciones de bebidas y condimentos.
 *
 * @author JoseH
 */
public class StarbuzzCoffeeDecorator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Beverage> orden = new ArrayList<>();
        String continuar;

        do {
                Beverage beverage = seleccionarBebida(scanner);
            beverage = agregarCondimentos(beverage, scanner);
            orden.add(beverage);

            System.out.println("¿Desea agregar otra bebida? (si/no)");
            continuar = scanner.nextLine().toLowerCase();
        } while (continuar.equals("si"));

        mostrarPedido(orden);

        scanner.close();
    }

    /**
     * Método para seleccionar una bebida
     * @param scanner El objeto Scanner para la entrada del usuario.
     * @return La bebida seleccionada.
     */
    private static Beverage seleccionarBebida(Scanner scanner) {
        System.out.println("Seleccione una bebida:");
        System.out.println("1. House Blend");
        System.out.println("2. Dark Roast");
        System.out.println("3. Expresso");
        System.out.println("4. Decaf");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                return new HouseBlend();
            case 2:
                return new DarkRoast();
            case 3:
                return new Expresso();
            case 4:
                return new Decaf();
            default:
                System.out.println("Opción no válida, se seleccionará Expresso por defecto.");
                return new Expresso();
        }
    }

    /**
     * Método para agregar condimentos
     * @param beverage Bebida
     * @param scanner El objeto Scanner para la entrada del usuario.
     * @return Bebida modificada
     */
    private static Beverage agregarCondimentos(Beverage beverage, Scanner scanner) {
        String addCondiments;
        do {
            System.out.println("Seleccione un condimento:");
            System.out.println("1. Leche");
            System.out.println("2. Leche de soya");
            System.out.println("3. Crema batida");
            System.out.println("4. Chocolate");
            System.out.println("5. Ninguno");

            int condimentChoice = Integer.parseInt(scanner.nextLine());

            switch (condimentChoice) {
                case 1:
                    beverage = new Milk(beverage);
                    break;
                case 2:
                    beverage = new SoyMilk(beverage);
                    break;
                case 3:
                    beverage = new WhippedCream(beverage);
                    break;
                case 4:
                    beverage = new Chocolate(beverage);
                    break;
                case 5:
                    System.out.println("No se agregará ningún condimento.");
                    return beverage;
                default:
                    System.out.println("Opción no válida, no se agregará ningún condimento.");
            }

            System.out.println("¿Desea agregar otro condimento? (si/no)");
            addCondiments = scanner.nextLine().toLowerCase();

        } while (addCondiments.equals("si"));

        return beverage;
    }

    /**
     * Método para mostrar el resumen del pedido
     * @param orden Orden con las bebidas y condimentos
     */
    private static void mostrarPedido(ArrayList<Beverage> orden) {
        System.out.println("Resumen de su pedido:");
        double totalCost = 0;

        for (Beverage beverage : orden) {
            System.out.println(beverage.getDescription() + " - $" + beverage.getCost());
            totalCost += beverage.getCost();
        }

        System.out.println("Costo total: $" + totalCost);
    }
}
