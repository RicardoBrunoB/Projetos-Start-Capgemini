package ExercicioQuatorze;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.println("Informe um n�mero A: ");
        a = sc.nextInt();

        if (a >= 100 && a <=200) {
            System.out.println("O n�mero est� no intervalo entre 100 e 200");
        } else {
            System.out.println("O n�mero n�o est� no intervalo entre 100 e 200");
        }
        
    }

}
