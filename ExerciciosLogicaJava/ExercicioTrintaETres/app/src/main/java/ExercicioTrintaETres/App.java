package ExercicioTrintaETres;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qtdHora, salario = 0;
        int nivel;

        System.out.println("Informe o nível do professor -> 1, 2 ou 3: ");
        nivel = sc.nextInt();

        System.out.println("Informe a quantidade de horas trabalhadas pelo professor no mês: ");
        qtdHora = sc.nextDouble();

        switch (nivel) {
            case 1 -> salario = qtdHora * 12;
            case 2 -> salario = qtdHora * 17;
            case 3 -> salario = qtdHora * 25;
            default -> System.out.println("Favor informar o nível corretamente.");
        }
        System.out.println("Salário do professor: " + salario);

    }
}
