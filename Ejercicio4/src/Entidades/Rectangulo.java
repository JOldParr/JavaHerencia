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
public class Rectangulo implements calculoFormas{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        
        System.out.println("Indique la base del rectangulo");
        base=leer.nextDouble();
        System.out.println("Indique la altura del rectangulo");
        altura=leer.nextDouble();
        
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void calcularArea() {
       double area = base*altura;
        System.out.println("El area es: "+area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = (base+altura)*2;
        System.out.println("El perimetro es: "+perimetro);
    }
    
    
}
