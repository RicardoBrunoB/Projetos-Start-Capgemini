package ExercicioVinte;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**Concessionária CARANGO VELHO - Setor de Vendas**");

        double valorIni, valorFinal, valorDesc;
        double desc, ano;
        int countAntigo = 0;
        int countNovo = 0;
        char aux = 'S';

        while (aux != 'N') {

            System.out.println("Informe o ano do veículo: ");
            ano = sc.nextDouble();

            System.out.println("Informe o valor do veículo $$: ");
            valorIni = sc.nextDouble();

            if (ano <= 2000) {
                desc = 0.12;
                valorDesc = valorIni * desc;
                valorFinal = valorIni - valorDesc;
                System.out.println("Valor com desconto: " + valorFinal);
                System.out.println("Desconto concedido: " + valorDesc);
                countAntigo++;
            } else {
                desc = 0.07;
                valorDesc = valorIni * desc;
                valorFinal = valorIni - valorDesc;
                System.out.println("Valor com desconto: " + valorFinal);
                System.out.println("Desconto concedido: " + valorDesc);
                countNovo++;
            }

            System.out.println("Deseja continuar calculando? ");
            aux = sc.next().charAt(0);
        }
        countNovo = countNovo + countAntigo;
        System.out.println("Quantidade de carros de antes de 2000: " + countAntigo + "\nTotal de carros: " + countNovo);
        sc.close();
    }

}
