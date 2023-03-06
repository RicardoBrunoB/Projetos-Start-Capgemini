package Exercicion11POO;

public class IngressoVIP extends Ingresso{
    private double adicional = 0.25;

    public IngressoVIP(double valor) {
        super(valor);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    public void imprimirValor(double valor){
        valor = getValor();
        System.out.println("Valor do ingresso VIP: " + (valor + (valor * adicional)));
    }
}
