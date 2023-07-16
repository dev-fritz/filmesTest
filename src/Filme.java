public class Filme {
    String name;
    int anoLanc;
    boolean inPlano;
    int totalAvaliacoes;
    double avaliacao = 0;
    int minutos;

    void fichaTecnica(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de Lançamento: " + anoLanc);
    }

    void nota(double note){
        avaliacao += note;
        totalAvaliacoes++;
    }

    double pegaMedia() {return avaliacao/totalAvaliacoes;}
}
