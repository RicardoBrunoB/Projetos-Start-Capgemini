package Exercicion16POO;

public class Carro {

    private double tanqueCombustivel = 50;
    private double consumoCarro = 15;
    private double combustivelDisponivel;

    public Carro(double combustivelDisponivel) {
        this.combustivelDisponivel = combustivelDisponivel;
    }

    public double getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public void setTanqueCombustivel(double tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
    }

    public double getConsumoCarro() {
        return consumoCarro;
    }

    public void setConsumoCarro(double consumoCarro) {
        this.consumoCarro = consumoCarro;
    }

    public double getCombustivelDisponivel() {
        return combustivelDisponivel;
    }

    public void setCombustivelDisponivel(double combustivelDisponivel) {
        this.combustivelDisponivel = combustivelDisponivel;
    }

    public double abastecer(double abastecimento) {
        if (abastecimento + combustivelDisponivel > tanqueCombustivel) {
            System.out.println("Não foi possível abastecer a quantidade desejada, o tanque está muito cheio!");
            return combustivelDisponivel;
        }
        return combustivelDisponivel = abastecimento + combustivelDisponivel;
    }

    public void moverCarro(double distancia) {
        double totalConsumido;
        if (distancia > combustivelDisponivel * consumoCarro) {
            System.out.println("Distancia maior que o combustível disponível do tanque do carro!\nCombustível disponível: " + combustivelDisponivel + " litros.");
        } else {
            totalConsumido = distancia / consumoCarro;
            combustivelDisponivel = combustivelDisponivel - totalConsumido;
            System.out.println("Total consumido em litros: " + (totalConsumido) + "\nDistância percorrida em km: " + distancia);
        }
    }
}
