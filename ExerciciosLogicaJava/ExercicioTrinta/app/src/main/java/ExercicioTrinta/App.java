package ExercicioTrinta;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] listaNr = new int[3];

        for (int i = 1; i <= listaNr.length; i++) {
        System.out.println("Informe o "+ i + "º número: ");
        listaNr[i-1] = (sc.nextInt());
        }
        
        Arrays.sort(listaNr);
        System.out.println("Ordem crescente: ");
        
        for (int j = 0; j < listaNr.length; j++)
            System.out.println(listaNr[j] + " ");
    }
}
