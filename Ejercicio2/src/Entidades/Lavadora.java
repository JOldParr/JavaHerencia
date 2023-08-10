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
public class Lavadora extends Electrodomestico{
    protected double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Indique la carga de la lavadora");
        this.carga = leer.nextDouble();
        super.crearElectrodomestico(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double precioFinal() {
        if(this.carga>30d){
        this.precio = this.precio + 500d;
        }
        return super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
