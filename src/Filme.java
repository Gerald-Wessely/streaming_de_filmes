public class Filme {
     String nome;
     int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasValiacoes;
    int totalDeAvaliacao;
    int duracaoEmMinuto;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasValiacoes += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia(){
        return somaDasValiacoes / totalDeAvaliacao;
    }
}
