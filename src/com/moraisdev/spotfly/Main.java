package com.moraisdev.spotfly;
import com.moraisdev.spotfly.models.Musica;
import com.moraisdev.spotfly.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica("Chaos Is Me", 24, "Orchid", "Scremo/Emoviolence");
        minhaMusica.setTotalDeCurtidas(100);
        minhaMusica.setTotalDeReproducoes(100);
        minhaMusica.avaliacao(9.5);
        minhaMusica.avaliacao(9);
        minhaMusica.avaliacao(8);
        minhaMusica.detalhes();
        System.out.println("********************************");
        Podcast meuPodcast = new Podcast("Flow Podcast", 90, "Igor3k", "Podcast de variedades");
        meuPodcast.setTotalDeReproducoes(1000);
        meuPodcast.setTotalDeCurtidas(100);
        meuPodcast.avaliacao(9.5);
        meuPodcast.avaliacao(9.5);
        meuPodcast.avaliacao(9.5);

        meuPodcast.detalhes();
    }
}
