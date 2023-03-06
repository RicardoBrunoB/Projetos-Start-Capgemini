package Exercicion16POO;

public class App {

    public static void main(String[] args) {
        Carro c1 = new Carro(0);
        Carro c2 = new Carro(0);
        
        c1.abastecer(20);
        c2.abastecer(30);
        
        c1.moverCarro(200);
        c2.moverCarro(400);
        
    }
}
