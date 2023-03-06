package Exercicio6POO;

public class App {
    public static void main(String[] args) {
        Invoice i1 = new Invoice(132, "Caneta Premium", 6, 70);
        
        System.out.println(i1.getNumeroItem());
        System.out.println(i1.getDescricao());
        System.out.println(i1.getQtdItem());
        System.out.println(i1.getPrecoItem());
        System.out.println(i1.getInvoiceAmount());
    }
}
