package Exercicion14POO;

public class FaturaTeste {

    public static void main(String[] args) {
        Fatura f1 = new Fatura("01", "Desodorante", 15, 8.0d);
        
        System.out.println(f1.getDescricao());
        System.out.println(f1.getNumero());
        System.out.println(f1.getPrecoItem());
        System.out.println(f1.getQtdComprada());
        
        System.out.println(f1.getTotalFatura());
    }
}
