package ExercicioVinteENove;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o n�mero do m�s desejado: ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1 -> System.out.println("JANEIRO");
            case 2 -> System.out.println("FEVEREIRO");
            case 3 -> System.out.println("MAR�O");
            case 4 -> System.out.println("ABRIL");
            case 5 -> System.out.println("MAIO");
            case 6 -> System.out.println("JUNHO");
            case 7 -> System.out.println("JULHO");
            case 8 -> System.out.println("AGOSTO");
            case 9 -> System.out.println("SETEMBRO");
            case 10 -> System.out.println("OUTUBRO");
            case 11 -> System.out.println("NOVEMBRO");
            case 12 -> System.out.println("DEZEMBRO");
            default -> System.out.print("M�s inv�lido");
        }
        sc.close();
    }
}
