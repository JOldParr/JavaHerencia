/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class ServiciosLavadora extends ServiciosElectrodomestico{

        public Lavadora crearLavadora() {
        
        System.out.println("crear lavadora");
        Electrodomestico e = crearElectrodomestico();
        Lavadora l = new Lavadora();
        
        l.setColor(e.getColor());
        l.setConsumoEnergetico(e.getConsumoEnergetico());
        l.setPeso(e.getPeso());
        l.setPrecio(e.getPrecio());
        precioFinal(l);
        
        return l;
    }
    
    public void precioFinal(Lavadora l){
        l.setPrecio(super.precioFinal(l));
        System.out.println("indique la carga");
        l.setCarga(leer.nextInt());
        if(l.getCarga()>30){
            l.setPrecio(l.getPrecio()+500);
        }
        System.out.println("el precio del lavadora es: "+l.getPrecio());
        System.out.println(l.toString());
    }
    
    
    
    
}
