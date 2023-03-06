package Exercicion12POO;

public class App {
    public static void main(String[] args) {
        Agenda p1 = new Agenda();
        
        p1.armazenarPessoa("Jose", 20, 1.70f);
        p1.armazenarPessoa("Joaquim", 22, 1.75f);
        p1.armazenarPessoa("Maria", 30, 1.50f);
        p1.armazenarPessoa("Nicolas", 10, 1.30f);
        p1.removerPessoa("Joaquim");
        p1.buscarPessoa("Jose");
        p1.imprimirAgenda();
        p1.imprimirPessoa(2);
    }
}
