package ExercicioVinteECinco;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0;

        System.out.println("Informe o primeiro n�mero - A: ");
        a = sc.nextInt();

        System.out.println("Informe o segundo n�mero - B: ");
        b = sc.nextInt();

        if (a == b) {
            System.out.println("N�meros iguais");
        } else if (a > b) {
            System.out.println("A � maior que B!");
        } else {
            System.out.println("B � maior que A!");
        }
        sc.close();
    }
}
