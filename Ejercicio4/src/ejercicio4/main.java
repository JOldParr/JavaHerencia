/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import Entidades.Circulo;
import Entidades.Rectangulo;

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
        
        Circulo c = new Circulo();
        c.crearCirculo();
        c.calcularArea();
        c.calcularPerimetro();
        Rectangulo r = new Rectangulo();
        r.crearRectangulo();
        r.calcularArea();
        r.calcularPerimetro();
    }
    
}
