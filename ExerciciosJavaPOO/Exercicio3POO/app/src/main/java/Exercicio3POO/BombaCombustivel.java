package Exercicio3POO;

import java.util.Scanner;

public class BombaCombustivel {

    Scanner sc = new Scanner(System.in);

    private String tipoCombustivel;
    private double valorLitro;
    private double qtdCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double qtdCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.qtdCombustivel = qtdCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(double qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public void abastecerPorValor() {
        System.out.println("Informe o valor a abastecer: ");
        double valorAbastecimento = sc.nextDouble();
        System.out.println("Quantidade de litros abastecida: " + (valorAbastecimento / valorLitro));
    }

    public void abastecerPorLitro() {
        System.out.println("Informe a quantidade de litros a abastecer: ");
        double litrosAbastecimento = sc.nextDouble();
        System.out.println("Valor a ser pago: " + (litrosAbastecimento * valorLitro));
    }

    public void alterarValor() {
        System.out.println("Informe o novo valor do litro de combustivel: ");
        this.valorLitro = sc.nextDouble();
        System.out.println("Novo valor para o litro de combustível: " + valorLitro);
    }

    public void alterarCombustivel() {
        System.out.println("Informe o novo tipo de combustivel: ");
        this.tipoCombustivel = sc.next();
        System.out.println("Tipo de combustível atual: " + tipoCombustivel);
    }

    public double alterarQuantidadeCombustivel() {
        System.out.println("Informe a quantidade de combustivel atual: ");
        this.qtdCombustivel = sc.nextDouble();
        return qtdCombustivel;
    }

    public void mostraDados() {
        System.out.println("\nSituação atual da bomba: "
                + "\nTipo de Combustivel: " + tipoCombustivel
                + "\nValor por litro: " + valorLitro
                + "\nQuantidade de combustível na bomba: " + qtdCombustivel);
    }
}
