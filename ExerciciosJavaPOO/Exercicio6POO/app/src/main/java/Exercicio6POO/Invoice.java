package Exercicio6POO;

public class Invoice {

    private int numeroItem;
    private String descricao;
    private double qtdItem;
    private double precoItem;

    public Invoice(int numeroItem, String descricao, double qtdItem, double precoItem) {
        this.numeroItem = numeroItem;
        this.descricao = descricao;
        this.qtdItem = qtdItem;
        this.precoItem = precoItem;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(double qtdItem) {
        if (qtdItem < 0) {
            this.qtdItem = 0;
        } else {
            this.qtdItem = qtdItem;
        }
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        if (precoItem < 0) {
            this.precoItem = 0;
        } else {
            this.precoItem = precoItem;
        }
    }

    public double getInvoiceAmount(){
        return qtdItem * precoItem;
    }
}
