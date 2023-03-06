package Exercicion11POO;

public class App {
    public static void main(String[] args) {
        Ingresso i1 = new Ingresso(5);
        IngressoVIP ivip1 = new IngressoVIP(5);
        
        i1.imprimirValor();
        ivip1.imprimirValor(5);
        System.out.println();
    }
}
