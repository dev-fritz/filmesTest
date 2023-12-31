package com.github.filmesAlura.modelos;

public class Serie extends Titulo {
    private int numeroEpisodios;
    private int numeroTemporadas;
    private int minutosPorEpisodio;
    private boolean ativa;


    public int getNumeroEpisodios(){
        return numeroEpisodios;
    }
    public void setNumeroEpisodios(int numeroEpisodios){
        this.numeroEpisodios = numeroEpisodios;
    }

    public int getNumeroTemporadas(){
        return numeroTemporadas;
    }
    public void setNumeroTemporadas(int numeroTemporadas){
        this.numeroTemporadas = numeroTemporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return numeroTemporadas * numeroEpisodios * minutosPorEpisodio;
    }

}
