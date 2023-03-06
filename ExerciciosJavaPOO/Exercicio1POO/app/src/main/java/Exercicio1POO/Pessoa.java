package Exercicio1POO;

import java.util.Calendar;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private double altura;

    public Pessoa(String nome, String dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void imprimirDados() {
        System.out.println("Nome: " + nome 
                + "\nData de nascimento: " + dataNascimento 
                + "\nAltura: " + altura);
    }
    
    public void calcularIdade() {
        //Busca ano, mes e data atual
        Calendar calendario = Calendar.getInstance();
        int anoDataAtual = calendario.get(Calendar.YEAR);
        int mesDataAtual = calendario.get(Calendar.MONTH) + 1;
        int diaDataAtual = calendario.get(Calendar.DAY_OF_MONTH);
        
        int anoNascimento = Integer.valueOf(dataNascimento.substring(6,10));
        int mesNascimento = Integer.valueOf(dataNascimento.substring(3,5));
        int diaNascimento = Integer.valueOf(dataNascimento.substring(0,2));
        
        int idade;
        
        if(mesNascimento == mesDataAtual || (mesNascimento == mesDataAtual && diaNascimento != diaDataAtual)){
           idade = anoDataAtual - anoNascimento; 
        } else{
            idade = (anoDataAtual - anoNascimento) - 1;
        }
        System.out.println("A pessoa tem " + idade + " anos.");
    }
}
