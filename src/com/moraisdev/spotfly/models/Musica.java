package com.moraisdev.spotfly.models;
//Classe Filha
public class Musica extends Audio{
    private String artista;
    private String generoMusical;

    //Construtor
    public Musica(String titulo, int duracao, String artista, String generoMusical){
        super(titulo, duracao);
        this.artista = artista;
        this.generoMusical = generoMusical;
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println("Artista: "+this.artista);
        System.out.println("Genero Musical: "+this.generoMusical);
    }

    //Getter & Setter
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getGeneroMusical() {
        return generoMusical;
    }
    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
}
