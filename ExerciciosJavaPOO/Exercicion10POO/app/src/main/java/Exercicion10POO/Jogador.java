package Exercicion10POO;

import java.util.Calendar;

public class Jogador {

    private String nome;
    private String posicao;
    private String dataNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public Jogador(String nome, String posicao, String dataNascimento, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void imprimirDados() {
        System.out.println(getNome()
                + getPosicao()
                + getDataNascimento()
                + getNacionalidade()
                + getAltura()
                + getPeso());
    }

    public void calculaIdade() {
        //obter data atual
        Calendar calendario = Calendar.getInstance();
        int anoDataAtual = calendario.get(Calendar.YEAR);

        //obter ano do nascimento
        String partesDataNascimento[] = dataNascimento.split("/");
        int anoNascimento = Integer.parseInt(partesDataNascimento[2]);

        //mostrar idade
        int idade = anoDataAtual - anoNascimento;
        System.out.println("O jogador tem " + idade + " anos.");
    }

    public int calculaAposentadoria(int idade) {

        //obter ano do nascimento
        String partesDataNascimento[] = dataNascimento.split("/");
        int anoNascimento = Integer.parseInt(partesDataNascimento[2]);

        if (null != this.posicao) switch (this.posicao) {
            case "Goleiro", "Zagueiro", "Lateral" -> {
                return 40 - idade;
            }
            case "Armador", "Volante", "Meio de Campo" -> {
                return 38 - idade;
            }
            case "Centro Avante", "Ponta", "Atacante" -> {
                return 35 - idade;
            }
            default -> {
            }
        }
            return 0;
        //(anoNascimento + 35 -(idade))
    }
}
