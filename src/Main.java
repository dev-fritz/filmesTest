public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.name = "Fritz: Films";
        meuFilme.anoLanc = 2023;
        meuFilme.inPlano = true;
        meuFilme.minutos = 200;

        meuFilme.fichaTecnica();
        meuFilme.nota(9);
        meuFilme.nota(9);
        meuFilme.nota(9);
        meuFilme.nota(10);
        System.out.println(meuFilme.pegaMedia());
    }
}