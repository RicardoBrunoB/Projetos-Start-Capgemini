package Exercicio8POO;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        Data d1 = new Data(12, 5, 2012);
        
        d1.comparar();
        System.out.println(d1.getDia());
        System.out.println(d1.getMes());
        d1.getMesExtenso();
        System.out.println(d1.getAno());
        d1.isBissexto();
        Data dataClonada = d1.clone();
        System.out.println("\n"+ dataClonada);
    }
}
