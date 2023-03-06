package Exercicion13POO;

public class App {

    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        
        System.out.println(c1.somar(2, 7));
        System.out.println(c1.subtrair(9, 1));
        System.out.println(c1.dividir(8, 2));
        System.out.println(c1.multiplicar(7,5));
        System.out.println(c1.potencia(10, 2));
        System.out.println(c1.raizQuadrada(16));
    }
}
