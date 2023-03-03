package ExercicioVinteECinco;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0;

        System.out.println("Informe o primeiro número - A: ");
        a = sc.nextInt();

        System.out.println("Informe o segundo número - B: ");
        b = sc.nextInt();

        if (a == b) {
            System.out.println("Números iguais");
        } else if (a > b) {
            System.out.println("A é maior que B!");
        } else {
            System.out.println("B é maior que A!");
        }
        sc.close();
    }
}
