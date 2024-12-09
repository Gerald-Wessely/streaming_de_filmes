package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
private int temporadas;
private boolean ativa;
private int episoDiosPorTemporada;
private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisoDiosPorTemporada() {
        return episoDiosPorTemporada;
    }

    public void setEpisoDiosPorTemporada(int episoDiosPorTemporada) {
        this.episoDiosPorTemporada = episoDiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
