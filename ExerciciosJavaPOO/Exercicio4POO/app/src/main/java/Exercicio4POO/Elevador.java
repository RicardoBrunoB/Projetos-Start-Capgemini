package Exercicio4POO;

import java.util.Scanner;

public class Elevador {

    private int andarAtual = 0;
    private int totalAndares;
    private int capacidadePessoas;
    private int qtdPessoasPresentes = 0;

    Scanner sc = new Scanner(System.in);

    public Elevador(int totalAndares, int capacidadePessoas) {
        this.totalAndares = totalAndares;
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getQtdPessoasPresentes() {
        return qtdPessoasPresentes;
    }

    public void setQtdPessoasPresentes(int qtdPessoasPresentes) {
        this.qtdPessoasPresentes = qtdPessoasPresentes;
    }

    public void inicializa() {
        this.andarAtual = 0;
        this.qtdPessoasPresentes = 0;

        System.out.println("Informe a quantidade de andares do pr�dio: ");
        this.totalAndares = sc.nextInt();

        System.out.println("Informe a capacidade de pessoas do elevador: ");
        this.capacidadePessoas = sc.nextInt();

    }

    public void entra() {
        if (qtdPessoasPresentes >= capacidadePessoas) {
            System.out.println("O elevador j� est� lotado, n�o � poss�vel comportar mais pessoas.");
        } else {
            qtdPessoasPresentes = qtdPessoasPresentes + 1;
            System.out.println("Entrada registrada");
        }
    }

    public int sai() {
        if (qtdPessoasPresentes <= 0) {
            System.out.println("N�o h� pessoas presentes no elevador.");
        } else {
            System.out.println("Sa�da registrada");
            return qtdPessoasPresentes = qtdPessoasPresentes - 1;
        }
        return qtdPessoasPresentes;
    }

    public int sobe() {
        if (andarAtual >= totalAndares) {
            System.out.println("O elevador j� est� no topo do pr�dio.");
        } else {
            System.out.println("Subiu 1 andar");
            return andarAtual = andarAtual + 1;
        }
        return andarAtual;
    }

    public int desce() {
        if (andarAtual <= 0) {
            System.out.println("O elevador j� est� no t�rreo.");
        } else {
            System.out.println("Desceu 1 andar");
            return andarAtual = andarAtual - 1;
        }
        return andarAtual;
    }

    public void getElevador() {
        System.out.println("Elevador: "
                + "\nAndar atual:" + getAndarAtual()
                + "\nTotal de andares do pr�dio: " + getTotalAndares()
                + "\nCapacidade de pessoas do elevador: " + getCapacidadePessoas()
                + "\nQuantidade de pessoas presentes: " + getQtdPessoasPresentes());

    }
}
