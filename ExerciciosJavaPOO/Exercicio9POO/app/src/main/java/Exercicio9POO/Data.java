package Exercicio9POO;

import java.util.Calendar;

public class Data implements Cloneable{

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        } else {
            this.dia = 1;
        }

        if (mes > 0 && mes < 13) {
            this.mes = mes;
        } else {
            this.mes = 1;
        }

        if (ano > 0 && ano < 2500) {
            this.ano = ano;
        } else {
            this.mes = 1;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void comparar() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(Calendar.YEAR) == ano && calendar.get(Calendar.MONTH) == mes && calendar.get(Calendar.DAY_OF_MONTH) == dia) {
            System.out.println("0");
        } else if (calendar.get(Calendar.YEAR) > ano
                || (calendar.get(Calendar.YEAR) == ano && calendar.get(Calendar.MONTH) > mes)
                || (calendar.get(Calendar.YEAR) == ano && calendar.get(Calendar.MONTH) == mes && calendar.get(Calendar.DAY_OF_MONTH) > dia)) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }

    public void getMesExtenso() {
        switch (mes) {
            case 1 ->
                System.out.println("1- Janeiro");
            case 2 ->
                System.out.println("2- Fevereiro");
            case 3 ->
                System.out.println("3- Março");
            case 4 ->
                System.out.println("4- Abril");
            case 5 ->
                System.out.println("5- Maio");
            case 6 ->
                System.out.println("6- Junho");
            case 7 ->
                System.out.println("7- Julho");
            case 8 ->
                System.out.println("8- Agosto");
            case 9 ->
                System.out.println("9- Setembro");
            case 10 ->
                System.out.println("10- Outubro");
            case 11 ->
                System.out.println("11- Novembro");
            case 12 ->
                System.out.println("12- Dezembro");
        }
    }

    public void isBissexto() {
        boolean validador;
        if (ano % 4 == 0) {
            System.out.println(validador = true);
        } else {
            System.out.println(validador = false);
        }
    }

    @Override
    public Data clone() throws CloneNotSupportedException {
        return (Data) super.clone();
    }

    @Override
    public String toString() {
        return "Data{" + "dia=" + dia + ", mes=" + mes + ", ano=" + ano + '}';
    }
}
