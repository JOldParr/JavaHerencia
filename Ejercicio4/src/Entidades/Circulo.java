/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import ejercicio4.calculoFormas;


/**
 *
 * @author Julian
 */
public class Circulo implements calculoFormas{
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCirculo(){
        System.out.println("Indique el radio del circulo");
        radio=(leer.nextDouble());
    }
    
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public void calcularArea() {
        double area=pi*Math.pow(radio, 2);
        System.out.println("el area es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2*pi*radio;
        System.out.println("El perimetro es: "+perimetro);
    }
       
    
}
