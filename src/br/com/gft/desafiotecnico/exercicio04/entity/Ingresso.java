package br.com.gft.desafiotecnico.exercicio04.entity;

public class Ingresso {

    private double valorReais;

    public double getValorReais() {
        return valorReais += 20.00;
    }

    public void setValorReais(double valorReais) {
        this.valorReais = valorReais;
    }

    public void imprimeValor(){
        System.out.println("O valor em reais é: R$" + getValorReais());
    }
}
