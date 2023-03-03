package ExercicioVinteEDois;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoCusto, precoVenda;
        
        double somaCusto = 0, somaVenda = 0;
        
        double n = 40;

        double mediaCusto = 0, mediaVenda = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o preço de custo do produto: ");
            precoCusto = sc.nextDouble();
            somaCusto = somaCusto + precoCusto;
            
            System.out.println("Informe o preço de venda do produto: ");
            precoVenda = sc.nextDouble();
            somaVenda = somaVenda + precoVenda;
            
            if (precoCusto < precoVenda) {
                System.out.println("Lucro");
            } else if (precoCusto > precoVenda){
                System.out.println("Prejuízo");
            } else {
                System.out.println("Empate");
            }
            mediaCusto = somaCusto / n;
            mediaVenda = somaVenda / n;
        }
        
        
        System.out.println("Média de preço de custo: " + mediaCusto
                + "\nMédia de preço de venda: " + mediaVenda);
        sc.close();
    }

}
