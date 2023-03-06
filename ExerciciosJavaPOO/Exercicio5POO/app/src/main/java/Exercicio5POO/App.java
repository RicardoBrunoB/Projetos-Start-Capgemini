package Exercicio5POO;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        Aluno a1 = new Aluno(123456, "Joao Antonio", 1, 1, 2);
        
        System.out.println("Acessando as notas do aluno...");

        do {
            System.out.println("Informe a op��o desejada --> 1 - Calcular media do aluno; 2 - Verificar se o aluno est� habilitado para a prova final; 3 - Consultar aluno; 0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    a1.calculaMedia();
                }
                case 2 -> {
                    a1.calculaFinal();
                    System.out.println("A m�dia �: " + a1.calculaMedia() + " e � necess�rio mais " + a1.calculaFinal() + " para ser aprovado");
                }
                case 3 -> {
                    System.out.println("Matricula: " + a1.getMatricula());
                    System.out.println("Nome: " +a1.getNome());
                    System.out.println("Nota da Prova 1: " +a1.getNotaProva1());
                    System.out.println("Nota da Prova 2: " +a1.getNotaProva2());
                    System.out.println("Nota do Trabalho: " +a1.getNotaTrabalho());
                }
                
                default ->
                    System.out.println("Valor inv�lido.");
            }
        } while (opcao != 0);
    }
}
