package br.com.gft.desafiotecnico.exercicio04.entity;

public class CamaroteInferior extends Vip {

    private String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void localizacaoIngresso(String assento){
        this.localizacao += assento;
    }

    public void imprimeLocalizacao(){
        System.out.println("Localização do seu ingresso: Camarote inferior" );
    }
}
