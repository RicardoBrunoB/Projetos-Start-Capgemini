/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ExercicioDois;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva 2 n�meros:");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int soma = a +b;
        int subtracao = a - b;
        int mult = a * b;
        int div = a / b;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtra��o: " + subtracao);
        System.out.println("Multiplica��o: " + mult);
        System.out.println("Divis�o: " + div);
        
        
    }
}
