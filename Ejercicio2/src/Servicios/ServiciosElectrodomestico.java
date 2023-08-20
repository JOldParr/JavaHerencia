/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class ServiciosElectrodomestico {
    Scanner leer = new Scanner(System.in);
    public Electrodomestico crearElectrodomestico() {
        
        Electrodomestico e = new Electrodomestico();
        System.out.println("Ingrese el color: ");
        e.setColor(comprobarColor(leer.nextLine()));
        System.out.println("Ingrese el consumo: ");
        e.setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().charAt(0)));
        System.out.println("Ingrese el peso: ");
        e.setPeso(leer.nextFloat());
        return e;
    }

    public char comprobarConsumoEnergetico(char consumoEnergetico) {
        //asignar un consumoEnergetico por defecto si no se cumple la condición
        consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        boolean condicionLetra = consumoEnergetico >= 'A' && consumoEnergetico <= 'F';

        if (!condicionLetra) {
            consumoEnergetico = 'F';
        }
        return consumoEnergetico;
    }

    public String comprobarColor(String color) {
        //asignar un color por defecto si no se cumple la condición
        color = color.toUpperCase();
        boolean condicionColor = color.equalsIgnoreCase("BLANCO") || color.equalsIgnoreCase("NEGRO")
                || color.equalsIgnoreCase("AZUL") || color.equalsIgnoreCase("GRIS");
        if (!condicionColor) {
            color = "BLANCO";
        }
        return color;
    }

    public double precioFinal(Electrodomestico e) {
        e.setPrecio(1000d);
        //cambio de precio final por consumo
        switch (e.getConsumoEnergetico()) {
            case 'A':
                e.setPrecio(e.getPrecio() + 1000d);
                break;
            case 'B':
                e.setPrecio(e.getPrecio() + 800d);
                break;
            case 'C':
                e.setPrecio(e.getPrecio() + 600d);
                break;
            case 'D':
                e.setPrecio(e.getPrecio() + 500d);
                break;
            case 'E':
                e.setPrecio(e.getPrecio() + 300d);
                break;
            case 'F':
                e.setPrecio(e.getPrecio() + 100d);
                break;

        }

        //cambio de precio final por precio
        if (1f < e.getPeso() && e.getPeso() < 20f) {
            e.setPrecio(e.getPrecio() + 100d);
        }
        if (20f <= e.getPeso() && e.getPeso() < 50f) {
            e.setPrecio(e.getPrecio() + 500d);
        }
        if (20f <= e.getPeso() && e.getPeso() < 50f) {
            e.setPrecio(e.getPrecio() + 600d);
        }
        if (50f <= e.getPeso() && e.getPeso() < 80f) {
            e.setPrecio(e.getPrecio() + 800d);
        }
        if (80f <= e.getPeso()) {
            e.setPrecio(e.getPrecio() + 1000d);
        }

        return e.getPrecio();
    }
    
    
}
