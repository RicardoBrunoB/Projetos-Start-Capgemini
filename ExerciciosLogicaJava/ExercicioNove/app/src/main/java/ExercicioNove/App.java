package ExercicioNove;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rend = 0.07;

        System.out.println("Valor depositado: ");
        double dep = sc.nextDouble();

        double total = dep + (dep * rend);
        System.out.println("Valor com rendimento após 1 mês: " + total);
    }
}
