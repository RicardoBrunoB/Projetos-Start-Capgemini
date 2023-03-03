package ExercicioVinteEQuatro;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nr = 0, count = 0;

        System.out.println("Informe a quantidade de números que deseja analisar: ");
        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Informe o número: ");
            nr = sc.nextInt();

            if (nr > 0) {
                System.out.println("Positivo");
            } else if (nr == 0){
                System.out.println("Zero");
            } else{
                System.out.println("Negativo"); 
            }
        }
        sc.close();
    }

}
