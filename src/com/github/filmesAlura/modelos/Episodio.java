package com.github.filmesAlura.modelos;

import com.github.filmesAlura.calculo.Classificavel;

public class Episodio implements Classificavel {
    private String name;
    private int numero;
    private Serie serie;

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao(){
        if (serie.getTotalVisualizacoes() >= 100){return 4;}
        else {return 3;}
    }

}
