package ExercicioTreze;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr;
        
        System.out.println("Informe um n�mero: ");
        nr = sc.nextInt();

        if (nr > 10) {
            System.out.println("Valor maior que 10!");
        } else {
            System.out.println("N�o � maior que 10!");
        }
        
    }

}
