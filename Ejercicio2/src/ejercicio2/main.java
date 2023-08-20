/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Servicios.ServiciosElectrodomestico;
import Servicios.ServiciosLavadora;
import Servicios.ServiciosTelevisor;

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
        ServiciosLavadora se = new ServiciosLavadora();
        ServiciosTelevisor st = new ServiciosTelevisor();
        st.crearTelevisor();
        //se.crearLavadora();
        
    }
    
}
