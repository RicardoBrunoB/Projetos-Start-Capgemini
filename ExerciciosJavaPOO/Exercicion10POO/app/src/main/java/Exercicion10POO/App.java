package Exercicion10POO;

public class App {

    public static void main(String[] args) {

        Jogador j1 = new Jogador("Neymar", "Ponta", "10/08/1990", "Brasileiro", 1.75, 60);

        j1.imprimirDados();
        j1.getNome();
        j1.getPosicao();
        j1.getDataNascimento();
        j1.getNacionalidade();
        j1.getAltura();
        j1.calculaIdade();
        System.out.println("Faltam " + j1.calculaAposentadoria(33) + " anos para o jogador aposentar.");
    }
}
