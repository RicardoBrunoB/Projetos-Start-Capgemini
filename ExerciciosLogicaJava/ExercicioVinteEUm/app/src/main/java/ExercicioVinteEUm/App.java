package ExercicioVinteEUm;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade = 0;
        int totalAptos = 0;
        int totalInaptos = 0;
        int totalGeral = 0;
        char sexo, saude;
        int count = 0;

        System.out.println("Informe a quantidade de pessoas que deseja analisar: ");
        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Informe o nome: ");
            nome = sc.next();

            System.out.println("Informe o sexo - M(Masc.) | F(Fem.): ");
            sexo = sc.next().charAt(0);

            System.out.println("Informe a idade: ");
            idade = sc.nextInt();

            System.out.println("Informe a situação da saúde - A(apto) | I(inapto): ");
            saude = sc.next().charAt(0);

            if (sexo == 'M' && idade >= 18 && saude == 'A') {
                System.out.println("Apto para o serviço militar!!");
                totalAptos++;
                totalGeral++;
            } else {
                System.out.println("Inapto!!");
                totalInaptos++;
                totalGeral++;
            }
        }
        System.out.println("Quantidade de aptos: " + totalAptos 
                + "\nQuantidade de inaptos: " + totalInaptos 
                + "\nQuantidade total: " + totalGeral);
        sc.close();
    }

}
