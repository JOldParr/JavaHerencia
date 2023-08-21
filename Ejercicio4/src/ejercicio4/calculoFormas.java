/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public interface calculoFormas {
    Scanner leer = new Scanner(System.in);
    final double pi= Math.PI;
    public void calcularArea();
    public void calcularPerimetro();
}
