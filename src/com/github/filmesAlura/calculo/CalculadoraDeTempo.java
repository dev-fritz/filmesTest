package com.github.filmesAlura.calculo;
import com.github.filmesAlura.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void adicionar(Titulo f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }
}
