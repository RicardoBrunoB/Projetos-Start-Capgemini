package Exercicio2POO;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        
        System.out.println("Acessando os dados da conta: ");
        ContaCorrente c1 = new ContaCorrente(123456, "Jose da Silva", 1000);
        c1.mostrarConta();
        
        do {
        System.out.println("Informe a op��o desejada --> 1 - Alterar nome do correntista; 2 - Dep�sito; 3 - Saque; 0 - Sair");
        opcao = sc.nextInt();
        
        switch (opcao) {
            case 1 -> {
                c1.alterarNome(); c1.mostrarConta();
                }
            case 2 -> {
                c1.depositar(); c1.mostrarConta();
                }
            case 3 -> {
                c1.sacar(); c1.mostrarConta();
                }
            case 0 -> {
                System.out.println("Opera��o encerrada.");
                }
            default -> System.out.println("Valor inv�lido.");
        }
        } while (opcao != 0);
    }
}
