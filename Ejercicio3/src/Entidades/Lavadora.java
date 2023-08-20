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
    private int carga;

    public Lavadora() {
        
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + ", carga: " + carga + "}"; //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
    
    
}
