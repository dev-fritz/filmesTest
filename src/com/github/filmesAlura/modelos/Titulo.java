package com.github.filmesAlura.modelos;

public class Titulo {
    private String name;

    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private int totalDeAvaliacoes;

    private boolean incluidoNoPlano;

    private double avaliacoes = 0;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public void setTotalDeAvaliacoes(int totalDeAvaliacoes){
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getAvaliacoes(){
        return avaliacoes;
    }
    public void setAvaliacoes(double avaliacoes){
        this.avaliacoes = avaliacoes;
    }

    public void fichaTecnica(){
        System.out.printf("""
                Nome: %s
                Duração: %d minutos
                Avaliação: %.1f""",name,duracaoEmMinutos,pegaMedia());
    }

    public void avalia(double nota){
        avaliacoes += nota;
    }

    public double pegaMedia(){
        return avaliacoes / totalDeAvaliacoes;
    }
}
