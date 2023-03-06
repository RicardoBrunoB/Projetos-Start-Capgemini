package Exercicio9POO;

import java.util.Arrays;

public class Voo {

    private String[] qtdPassageiros;
    private int nrVoo;
    private Data data;

    public Voo(int nrVoo, Data data) {
        this.qtdPassageiros = new String[100];
        this.nrVoo = nrVoo;
        this.data = data;
    }

    public int proximoLivre() {
        for (int i = 0; i < qtdPassageiros.length; i++) {
            if (qtdPassageiros[i] == null) {
                return i;
            }
        }
        return 0;
    }

    public void verifica(int numeroCadeira) {
        for (int i = 0; i < qtdPassageiros.length; i++) {
            if (numeroCadeira == i) {
                if (qtdPassageiros[i] == null) {
                    System.out.println("Cadeira " + i + " livre");
                } else {
                    System.out.println("Cadeira " + i + " ocupada");
                }
            }
        }
    }

    public boolean ocupa(int numeroCadeira) {
        for (int i = 0; i < qtdPassageiros.length; i++) {
            if (numeroCadeira == i) {
                if (qtdPassageiros[i] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int vagas() {
        int contadorVagas = 0;
        for (int i = 0; i < qtdPassageiros.length; i++) {
            if (qtdPassageiros[i] == null) {
                contadorVagas++;
            }
        }
        return contadorVagas;
    }

    public int getVoo() {
        return nrVoo;
    }

    @Override
    public String toString() {
        return "Voo{" + "qtdPassageiros=" + Arrays.toString(qtdPassageiros) + ", nrVoo=" + nrVoo + ", data=" + data + '}';
    }
    
    
}
