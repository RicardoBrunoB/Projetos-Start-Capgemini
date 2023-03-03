package ExercicioSeis;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aux;

        System.out.println("Digite a variável A: ");
        double a = sc.nextDouble();

        System.out.println("Digite a variável B: ");
        double b = sc.nextDouble();

        aux = a;
        a = b;
        b = aux;

        System.out.println("A: " + a + "| B: " + b);
    }

}
