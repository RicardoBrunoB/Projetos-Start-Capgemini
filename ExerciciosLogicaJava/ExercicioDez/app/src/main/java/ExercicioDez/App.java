package ExercicioDez;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da compra: ");
        double valor = sc.nextDouble();

        double prest = valor /5;
        
        System.out.println("Valor dividido em 5 prestações sem juros: " + prest);
        
    }

}
