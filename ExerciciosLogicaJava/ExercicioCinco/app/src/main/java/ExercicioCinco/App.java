package ExercicioCinco;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.next();

        System.out.println("Digite a nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média do aluno " + nome + ": " + media);
    }

}
