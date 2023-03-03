package ExercicioDezoito;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        int j = 0;

        for (int i = 0; i < 2; j++) {
            System.out.println("Informe a idade: ");
            idade = sc.nextInt();

            if (idade >= 18) {
                System.out.println("Maior de idade.");
            } else if (idade < 18) {
                System.out.println("Menor de idade.");
            }
        }

    }

}
