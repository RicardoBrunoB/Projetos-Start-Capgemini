package ExercicioOito;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorReal;
        double cotacaoDolar;
        double qtdDolar;

        System.out.println("Informe a cota��o: ");
        cotacaoDolar = sc.nextDouble();

        System.out.println("Informe a quantidade de d�lares: ");
        qtdDolar = sc.nextDouble();

        valorReal = cotacaoDolar * qtdDolar;
        
        System.out.println("Valor convertido em reais(R$): " + valorReal);
    }

}
