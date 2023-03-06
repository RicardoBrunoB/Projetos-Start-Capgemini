package Exercicio2POO;

import java.util.Scanner;

public class ContaCorrente {

    Scanner sc = new Scanner(System.in);
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void alterarNome() {
        System.out.println("Novo nome: ");
        String novoNome = sc.next();
        this.nomeCorrentista = novoNome;
    }

    public void depositar() {
        System.out.println("Valor a ser depositado: ");
        double valorDeposito = sc.nextDouble();
        this.saldo = saldo + valorDeposito;
    }

    public void sacar() {
        System.out.println("Valor a ser sacado: ");
        double valorSaque = sc.nextDouble();
        if (valorSaque > saldo) {
            System.out.println("Operação inválida!");
        } else {
            this.saldo = saldo - valorSaque;
        }
    }
    
    public void mostrarConta(){
        System.out.println("Correntista: " + this.nomeCorrentista
        + "\nNúmero da Conta: " + this.numeroConta
        + "\nSaldo: " + this.saldo);
    }
}
