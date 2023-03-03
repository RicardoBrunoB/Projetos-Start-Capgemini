package ExercicioTrintaEDois;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        String tipoTriangulo;

        System.out.println("Insira o comprimento dos 3 lados do tri�ngulo: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c){
                System.out.println("Tri�ngulo Equil�tero\nTamb�m � tri�ngulo Is�sceles");
            } else if (a == b || b == c || a == c){
                System.out.println("Tri�ngulo Is�sceles");
            } else if (a != b && b!=c && a != c) {
                System.out.println("Tri�ngulo Escaleno");
            }
        } else {
            System.out.println("N�o � um tri�ngulo.");
        }
    }
}
