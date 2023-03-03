package ExercicioTrintaEQuatro;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a idade do nadador para ser classificado na categoria adequada: ");
        int idade= sc.nextInt();

        if (idade>= 5 && idade<= 7) {
            System.out.println("Infantil A");
        } else if (idade>= 8 && idade<= 10) {
            System.out.println("Infantil B");
        } else if (idade>= 11 && idade<= 13) {
            System.out.println("Juvenil A");
        } else if (idade>= 14 && idade<= 17) {
            System.out.println("Juvenil B");
        } else if (idade>= 18 && idade<= 25) {
            System.out.println("Sênior");
        } else {
            System.out.println("Idade fora da faixa etária");
        }
    }
}
