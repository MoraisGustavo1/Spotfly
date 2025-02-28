package com.moraisdev.spotfly.models;
//SuperClass
public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes = 0;
    private int totalDeCurtidas = 0;
    private int somaNota;
    private int nota;

    //Construtor
    public Audio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    //Metodos
    public void detalhes(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Duração: " + this.duracao + " minutos");
        System.out.println("Total de Reproduções: " + this.totalDeReproducoes);
        System.out.println("Total de Curtidas: " + this.totalDeCurtidas);
        System.out.println("Nota: "+ mediaNotas());
    }
    public void curtir(){
        this.totalDeCurtidas ++;
    }
    public void reproducoes(){
        this.totalDeReproducoes++;
    }
    public void avaliacao(double avalicao){
        somaNota += avalicao;
        nota ++;
    }
    public double mediaNotas(){
        return somaNota / nota;
    }


    //Getters & Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }
    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }
    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }
    public void setTotalDeCurtidas(int totalDeCurtidas) {
        this.totalDeCurtidas = totalDeCurtidas;
    }
}
