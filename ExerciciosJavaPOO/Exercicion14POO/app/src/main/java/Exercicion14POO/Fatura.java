package Exercicion14POO;

public class Fatura {
    private String numero;
    private String descricao;
    private int qtdComprada;
    private double precoItem;

    public Fatura(String numero, String descricao, int qtdComprada, double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtdComprada = qtdComprada;
        this.precoItem = precoItem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
    
    public double getTotalFatura(){
        if (qtdComprada * precoItem < 0.0)
            return 0;
        return this.qtdComprada * this.precoItem;
    }
    
    
}
