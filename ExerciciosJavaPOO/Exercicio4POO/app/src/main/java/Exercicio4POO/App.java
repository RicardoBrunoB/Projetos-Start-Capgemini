package Exercicio4POO;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        Elevador e1 = new Elevador(6, 12);

        System.out.println("Acessando o elevador...");

        do {
            System.out.println("Informe a opção desejada --> 0- Inicializar elevador; 1 - Registrar a entrada de uma pessoa; 2 - Registrar a saída de 1 pessoa; 3 - Subir 1 andar; 4 - Descer 1 andar; 5 - Mostra elevador; 6 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0 -> {
                    e1.inicializa();
                    e1.getElevador();
                }
                case 1 -> {
                    e1.entra();
                }
                case 2 -> {
                    e1.sai();
                }
                case 3 -> {
                    e1.sobe();
                }
                case 4 -> {
                    e1.desce();
                }
                case 5 -> {
                    e1.getElevador();
                }
                case 6 -> {
                    System.out.println("Operação encerrada.");
                }
                default ->
                    System.out.println("Valor inválido.");
            }
        } while (opcao != 6);
    }
}
