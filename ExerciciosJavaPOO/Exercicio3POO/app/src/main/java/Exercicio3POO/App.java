package Exercicio3POO;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        BombaCombustivel bc1 = new BombaCombustivel("Gasolina", 5.16, 60);

        do {
            System.out.println("Informe a opção desejada: \n1- Abastecer por valor; 2- Abastecer por litro; 3- Alterar valor do litro; 4- Alterar tipo de combustível; 5- Alterar quantidade de combustível restante na bomba; 0- Sair:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    bc1.abastecerPorValor();
                    bc1.mostraDados();
                }
                case 2 -> {
                    bc1.abastecerPorLitro();
                    bc1.mostraDados();
                }
                case 3 -> {
                    bc1.alterarValor();
                    bc1.mostraDados();
                }
                case 4 -> {
                    bc1.alterarCombustivel();
                    bc1.mostraDados();
                }
                case 5 -> {
                    bc1.alterarQuantidadeCombustivel();
                    bc1.mostraDados();
                }
                case 0 -> {
                    System.out.println("Operação encerrada.");
                }
                default ->
                    System.out.println("Operação concluída.");
            }
        } while (opcao != 0);
    }
}
