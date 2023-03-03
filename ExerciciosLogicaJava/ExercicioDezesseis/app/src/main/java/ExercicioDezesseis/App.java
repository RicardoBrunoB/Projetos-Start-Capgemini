package ExercicioDezesseis;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        double n1, n2, n3, media;

        System.out.println("Informe o nome do aluno: ");
        nome = sc.nextLine();
        
        System.out.println("Nota 1: ");
        n1 = sc.nextDouble();
        
        System.out.println("Nota 2: ");
        n2 = sc.nextDouble();
        
        System.out.println("Nota 3: ");
        n3 = sc.nextDouble();
        
        media = (n1+n2+n3)/3;

        if (media>=7) {
            System.out.println(nome + " foi aprovado com média " + media);
        } else if (media <= 5) {
            System.out.println(nome + " foi reprovado com média " + media);
        } else if (media > 5 && media < 7) {
            System.out.println(nome + " ficou de recuperação com média " + media);
        } else {
            System.out.println("Erro");
        }

    }

}
