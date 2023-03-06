package Exercicio7POO;

public class Funcionario {
    private String pNome;
    private String uNome;
    private double salario;

    public Funcionario(String pNome, String uNome, double salario) {
        this.pNome = pNome;
        this.uNome = uNome;
        this.salario = salario;
    }

    public String getpNome() {
        return pNome;
    }

    public void setpNome(String pNome) {
        this.pNome = pNome;
    }

    public String getuNome() {
        return uNome;
    }

    public void setuNome(String uNome) {
        this.uNome = uNome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 0.0){
            this.salario = 0;
        } else {
            this.salario = salario;    
        }
    }
    
    public double getSalarioAnual(double salario){
        return salario * 12;
    }
}
