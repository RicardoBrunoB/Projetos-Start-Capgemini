package Exercicio7POO;

public class App {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Fulano", "da Silva", 15000);
        Funcionario f2 = new Funcionario("Beltrano", "Alves", -1000);
        
        System.out.println(
        f1.getpNome() + "\n" +
        f1.getuNome() + "\n" +
        f1.getSalario() + "\n" +
        f1.getSalarioAnual(f1.getSalario())
        );
        
        System.out.println( "\n" +
        f2.getpNome() + "\n" +
        f2.getuNome() + "\n" +
        f2.getSalario() + "\n" +
        f2.getSalarioAnual(f2.getSalario())
        );
    }
}
