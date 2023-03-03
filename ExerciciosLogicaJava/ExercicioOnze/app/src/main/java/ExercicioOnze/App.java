package ExercicioOnze;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoCusto;
        double porcentagem;
        
        System.out.println("Informe o preço de custo: ");
        precoCusto = sc.nextDouble();

        System.out.println("Informe a porcentagem de venda: ");
        porcentagem = sc.nextDouble();

        double valorVenda = precoCusto + (precoCusto*porcentagem/100);
        
        System.out.println("Preço de venda: " + valorVenda);
    }

}
