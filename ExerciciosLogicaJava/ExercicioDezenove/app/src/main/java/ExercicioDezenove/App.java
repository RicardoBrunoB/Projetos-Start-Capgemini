/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ExercicioDezenove;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        char sexo;
        int countHomens = 0;
        int countMulheres = 0;

        for (int i = 0; i <56; i++) {
            System.out.println("Informe o nome: ");
            nome = sc.next();
            
            System.out.println("Informe o sexo: ");
            sexo = sc.next().charAt(0);

            System.out.print("Nome: " + nome);
            if (sexo == 'M') {
                System.out.println(" Homem");
                countHomens ++;
            } else if (sexo == 'F') {
                System.out.println(" Mulher");
                countMulheres++;
            } else {
                System.out.println(" Erro");
            }
            
        }
        System.out.println("Qtd Homens:" + countHomens);
        System.out.println("Qtd Mulheres:" + countMulheres);
        sc.close();
    }

}
