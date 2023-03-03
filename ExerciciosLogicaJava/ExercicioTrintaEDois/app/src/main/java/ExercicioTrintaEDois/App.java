package ExercicioTrintaEDois;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        String tipoTriangulo;

        System.out.println("Insira o comprimento dos 3 lados do triângulo: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c){
                System.out.println("Triângulo Equilátero\nTambém é triângulo Isósceles");
            } else if (a == b || b == c || a == c){
                System.out.println("Triângulo Isósceles");
            } else if (a != b && b!=c && a != c) {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }
    }
}
