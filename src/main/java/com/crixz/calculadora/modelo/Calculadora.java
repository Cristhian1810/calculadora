package com.crixz.calculadora.modelo;

/**
 *
 * @author Cristhian
 */
public class Calculadora {
    public double sumar(double a, double b) {
        return a + b;
    }
    
    public double restar(double a, double b) {
        return a - b;
    }
    
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    public double dividir(double a, double b) {
        return a / b;
    }
    
    public double potenciar(double a, double b) {
        return Math.pow(a, b);
    }
    
    public double SacarRaizCuadrada(double a) {
        return Math.sqrt(a);
    }
}
