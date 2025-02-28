package com.moraisdev.spotfly.models;
//Classe Filha
public class Podcast extends Audio{
    private String host;
    private String descricao;

    //Construtor
    public Podcast(String titulo, int duracao, String host, String descricao){
        super(titulo, duracao);
        this.host = host;
        this.descricao = descricao;
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println("Host: "+host);
        System.out.println("Descrição: "+descricao);
    }

    //Getter & Setter
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
