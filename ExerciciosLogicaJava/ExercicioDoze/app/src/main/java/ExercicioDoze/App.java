package ExercicioDoze;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoCusto;
        double pDistribuidor;
        double pImposto;
        
        System.out.println("Informe o custo de f�brica: ");
        precoCusto = sc.nextDouble();

        pImposto = precoCusto + (precoCusto * 0.45);
        pDistribuidor = pImposto + (pImposto * 0.28);
        
        System.out.println("Pre�o de venda: " + pDistribuidor);
    }

}
