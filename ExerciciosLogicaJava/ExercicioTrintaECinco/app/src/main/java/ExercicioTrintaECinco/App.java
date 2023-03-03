package ExercicioTrintaECinco;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoCliente;
        double horas, valorConta = 0;
        
        System.out.println("Informe o tipo de cliente: \n1- Resid�ncia \n2- Com�rcio \n3- Ind�stria");
        tipoCliente = sc.nextInt();
        
        System.out.println("Informe quantas horas de consumo foram utilizadas: ");
        horas = sc.nextDouble();
        
        switch (tipoCliente) {
            case 1 -> valorConta = horas * 0.6;
            case 2 -> valorConta = horas * 0.48;
            case 3 -> valorConta = horas * 1.29;
            default -> System.out.println("Tipo inv�lido.");
        }
        System.out.println("Valor da conta de luz: " + valorConta + " Reais.");
    }
}
