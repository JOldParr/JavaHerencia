/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, float peso) {

        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char consumoEnergetico) {
        //asignar un consumoEnergetico por defecto si no se cumple la condición
        consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        boolean condicionLetra = consumoEnergetico == 'A' || consumoEnergetico == 'B'
                || consumoEnergetico == 'C' || consumoEnergetico == 'D'
                || consumoEnergetico == 'E' || consumoEnergetico == 'F';

        if (!condicionLetra) {
            consumoEnergetico = 'F';
        }
        return consumoEnergetico;
    }

    private String comprobarColor(String color) {
        //asignar un color por defecto si no se cumple la condición
        color = color.toUpperCase();

        boolean condicionColor = color.equalsIgnoreCase("BLANCO") || color.equalsIgnoreCase("NEGRO")
                || color.equalsIgnoreCase("AZUL") || color.equalsIgnoreCase("GRIS");
        if (!condicionColor) {
            color = "BLANCO";
        }
        return color;
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el color: ");
        this.color = comprobarColor(leer.next());
        System.out.println("Ingrese el consumo: ");
        this.consumoEnergetico = comprobarConsumoEnergetico(leer.next().charAt(0));
        System.out.println("Ingrese el peso: ");
        this.peso = leer.nextFloat();
        System.out.println("Se tiene un precio base de: " + 1000d);
        this.precio = precioFinal();
        leer.close();

    }

    public double precioFinal() {
        double precio = 0d;
        //cambio de precio final por consumo
        if (this.consumoEnergetico == 'A') {
            precio = precio + 1000d;
        }
        if (this.consumoEnergetico == 'B') {
            precio = precio + 800d;
        }
        if (this.consumoEnergetico == 'C') {
            precio = precio + 600d;
        }
        if (this.consumoEnergetico == 'D') {
            precio = precio + 500d;
        }
        if (this.consumoEnergetico == 'E') {
            precio = precio + 300d;
        }
        if (this.consumoEnergetico == 'F') {
            precio = precio + 100d;
        }
        //cambio de precio final por precio
        if (1f < this.peso && this.peso < 20f) {
            precio = precio + 100d;
        }
        if (20f <= this.peso && this.peso < 50f) {
            precio = precio + 500d;
        }
        if (20f <= this.peso && this.peso < 50f) {
            precio = precio + 500d;
        }
        if (50f <= this.peso && this.peso < 80f) {
            precio = precio + 800d;
        }
        if (80f <= this.peso) {
            precio = precio + 1000d;
        }

        return precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
