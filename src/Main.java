//import com.github.filmesAlura.modelos.Filme;
import com.github.filmesAlura.calculo.FiltroRecomendacao;
import com.github.filmesAlura.modelos.Episodio;
import com.github.filmesAlura.modelos.Filme;
import com.github.filmesAlura.modelos.Serie;
import com.github.filmesAlura.calculo.CalculadoraDeTempo;

public class Main {
    public static void main(String[] args) {
        Serie gato = new Serie();
        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        Filme film1 = new Filme();
        Filme film2 = new Filme();

        film1.setName("Homem Arania");
        film1.setDuracaoEmMinutos(123);
        film1.avalia(8.6);

        film2.setName("Homem Formiga");
        film2.setDuracaoEmMinutos(86);
        film2.avalia(7.4);


        gato.setName("El Gato de Botas");
        gato.setIncluidoNoPlano(true);
        gato.avalia(9);
        gato.avalia(7.6);
        gato.avalia(6.8);
        gato.avalia(8.4);
        gato.avalia(10);

        gato.setMinutosPorEpisodio(43);
        gato.setNumeroEpisodios(24);
        gato.setNumeroTemporadas(4);

        gato.fichaTecnica();

        calc.adicionar(film2);
        calc.adicionar(film1);

        System.out.println(calc.getTempoTotal());

        System.out.printf("Tempo para maratonar a serie: %d minutos%n", gato.getDuracaoEmMinutos());
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtro(film1);

        Episodio gat = new Episodio();
        gat.setNumero(1);
        gato.setTotalVisualizacoes(999);
        gat.setSerie(gato);
        filtro.filtro(gat);
    }
}