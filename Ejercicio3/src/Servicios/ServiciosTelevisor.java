/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;

/**
 *
 * @author Julian
 */
public class ServiciosTelevisor extends ServiciosElectrodomestico{
    public Televisor crearTelevisor(){
        System.out.println("crear televisor");
        Electrodomestico e = crearElectrodomestico();
        Televisor t = new Televisor();
        t.setColor(e.getColor());
        t.setConsumoEnergetico(e.getConsumoEnergetico());
        t.setPeso(e.getPeso());
        System.out.println("indique la resolucion");
        t.setResolucion(leer.nextInt());
        System.out.println("TIENE ANTENA TDT 0/1");
        t.setSintonizadorTDT(leer.hasNext());
        precioFinal(t);
        return t;
        
    }

    public void precioFinal(Televisor t) {
        t.setPrecio(super.precioFinal(t)); 
        if(t.getResolucion()>40){
            t.setPrecio(t.getPrecio()+0.3*t.getPrecio());
        }
        
        if(t.isSintonizadorTDT()){
            t.setPrecio(t.getPrecio()+500);
        }
        
        System.out.println("el precio del televisor es: "+t.getPrecio());
        System.out.println(t.toString());
    }
    
    
}
