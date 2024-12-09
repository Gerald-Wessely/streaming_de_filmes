import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setanoDeLancamento(2015);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());


    Serie lost = new Serie();
    lost.setNome("Lost");
    lost.setanoDeLancamento(2000);
    lost.exibeFichaTecnica();
    lost.setTemporadas(10);
    lost.setEpisoDiosPorTemporada(10);
    }
}
