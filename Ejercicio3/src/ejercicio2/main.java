/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.ServiciosElectrodomestico;
import Servicios.ServiciosLavadora;
import Servicios.ServiciosTelevisor;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Julian
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Electrodomestico e = new Electrodomestico(1500d,"aMARILLO",'Z',30f);
        ArrayList<Electrodomestico> lista = new ArrayList();
        //lavadora//(int carga, double precio, String color, char consumoEnergetico, float peso)
        Lavadora l1 = new Lavadora(90,2600d,"BLANCO",'F',90f);
        Lavadora l2 = new Lavadora(90,3500d,"AZUL",'A',90f);
        //Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, float peso) {
        Televisor t1 = new Televisor(4000,true,4400d,"ROJO",'A',100);
        Televisor t2 = new Televisor(10000,false,3400d,"negro",'A',25);

        lista.add(l1);
        lista.add(l2);
        lista.add(t1);
        lista.add(t2);
        double sum=0;
        for(Electrodomestico aux: lista){
            System.out.println(aux.getClass());
            System.out.println(aux.getPrecio());
            sum+=aux.getPrecio();
            
        }
        System.out.println("la suma de todos los productos es: " + sum);
    }
    
}
