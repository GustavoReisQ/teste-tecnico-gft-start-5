package br.com.gft.desafiotecnico.exercicio04.entity;

public class Vip extends Ingresso{

    private double valorAdicional;

    public double getValorAdicionalVip() {
        return valorAdicional+= 10.00;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void valorIngressoVip(){
        double valorIngressoVip = getValorReais() + getValorAdicionalVip();

        System.out.println("O valor do ingresso vip é: R$" + valorIngressoVip);
    }
}
