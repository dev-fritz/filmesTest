package com.github.filmesAlura.calculo;

import com.github.filmesAlura.modelos.Filme;

public class FiltroRecomendacao {
    public void filtro(Classificavel classificavel){
        if (classificavel.getClassificacao()>=4){
            System.out.println(": Esse é do bom");
        }
        else if(classificavel.getClassificacao()>=2){
            System.out.println(": Nem tão bom, mas dá pra ver");
        }
        else {
            System.out.println(": Horrivel");
        }
    }
}
