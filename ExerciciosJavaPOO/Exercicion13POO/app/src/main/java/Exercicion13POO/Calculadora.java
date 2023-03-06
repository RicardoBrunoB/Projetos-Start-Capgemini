package Exercicion13POO;

public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public float potencia(double a, double b) {
        return (float) Math.pow(a, b);
    }

    public double raizQuadrada(double a) {
        return Math.sqrt(a);
    }
}
