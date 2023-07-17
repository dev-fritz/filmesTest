import com.github.filmesAlura.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setName("Corno de 30 anos!");
        meuFilme.setAnoLanc(2013);
        meuFilme.setMinutos(125);
        meuFilme.setInPlano(true);

        meuFilme.fichaTecnica();
        meuFilme.nota(9);
        meuFilme.nota(9);
        meuFilme.nota(9);
        meuFilme.nota(10);
        System.out.println(meuFilme.pegaMedia());
        System.out.printf("%d Avaliações", meuFilme.getTotalAvaliacoes());
    }
}