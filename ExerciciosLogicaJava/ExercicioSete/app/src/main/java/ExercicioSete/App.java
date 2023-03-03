package ExercicioSete;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double tempC = sc.nextDouble();

        double tempF = (9 * tempC + 160) / 5;

        System.out.println("Temperatura em graus Celsius: " + tempC + "\nTemperatura em graus Fahrenheit: " + tempF);
    }

}
