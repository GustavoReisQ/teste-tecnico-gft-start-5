package br.com.gft.desafiotecnico.exercicio04.entity;

public class CamaroteSuperior extends Vip{

    private double valorAdicionalCamaroteSuperior;

    public double getValorAdicionalCamaroteSuperior() {
        return valorAdicionalCamaroteSuperior += 25.00;
    }

    public void setValorAdicionalCamaroteSuperior(double valorAdicionalCamaroteSuperior) {
        this.valorAdicionalCamaroteSuperior = valorAdicionalCamaroteSuperior;
    }

    public void valorIngressoCamaroteSuperior(){
        double valorIngressoCamaroteSuperior = getValorReais() + getValorAdicionalCamaroteSuperior();
        System.out.println("O valor do ingresso para o camarote superior é de: R$" + valorIngressoCamaroteSuperior);
    }
}
