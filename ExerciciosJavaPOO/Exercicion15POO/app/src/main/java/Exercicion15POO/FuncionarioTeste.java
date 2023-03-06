package Exercicion15POO;
public class FuncionarioTeste {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joao", "da Silva", 1000);
        Funcionario f2 = new Funcionario("Maria", "Almeida", 15000);
        
        f1.setSalarioMensal(1000*1.1);
        f2.setSalarioMensal(15000*1.1);
        
        System.out.println("Salário anual com aumento: " + f1.getSalarioMensal() * 12);
        System.out.println("Salário anual com aumento: " + f2.getSalarioMensal() * 12);
        
    }
}
