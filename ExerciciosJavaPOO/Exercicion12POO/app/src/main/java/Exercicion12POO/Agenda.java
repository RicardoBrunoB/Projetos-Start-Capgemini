package Exercicion12POO;

import java.util.ArrayList;

public class Agenda {

    ArrayList<String> pessoa = new ArrayList(10);

    public Agenda() {
    }

    public void armazenarPessoa(String nome, int idade, float altura) {
        pessoa.add(nome + "; " + idade + "; " + altura);
    }

    public void removerPessoa(String nome) {
        pessoa.remove(nome);
    }

    public void buscarPessoa(String nome) {
        int i, n = pessoa.size();
        String aux = nome;
        aux = aux.toUpperCase();
        String dados[];
        for (i = 0; i < n; i++) {
            if (pessoa.get(i).toUpperCase().contains(aux)) {
                dados = pessoa.get(i).split("; ");
                System.out.printf("\nNome: %s", dados[0]);
                System.out.printf("\nIdade: %s", dados[1]);
                System.out.printf("\nAltura: %s\n", dados[2]);
            }
        }
    }

    public void imprimirAgenda() {
        System.out.printf("\nImprimindo agenda:\n");
        int n = pessoa.size();
        for (int i = 0; i < n; i++) {
            System.out.printf("Posição %d- %s\n", i, pessoa.get(i));
        }
    }

    public void imprimirPessoa(int index) {
        System.out.printf("\nListando pessoa pesquisada\n");
        int i, n = pessoa.size();
        int aux = index;
        for (i = 0; i < n; i++) {
            if (i == aux) {
                System.out.printf("Posição %d- %s\n", i, pessoa.get(i));
            }
        }
    }

}
