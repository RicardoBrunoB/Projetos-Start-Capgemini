package Exercicio9POO;

public class App {
    public static void main(String[] args) {
        Voo v1 = new Voo(1, new Data(5, 6, 2012));
        
        v1.verifica(20);
        v1.proximoLivre();
        v1.ocupa(15);
        v1.vagas();
        v1.getVoo();
        
        System.out.println(v1);
    }
}
