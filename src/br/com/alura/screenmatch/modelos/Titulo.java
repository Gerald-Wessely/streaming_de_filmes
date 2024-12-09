package br.com.alura.screenmatch.modelos;

public class Titulo {
    private boolean incluidoNoPlano;
    private int duracaoEmMinuto;
    private String nome;
    private int anoDeLancamento;
    private double somaDasValiacoes;
    private int totalDeAvaliacao;

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setanoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinuto = duracaoEmMinutos;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasValiacoes += nota;
        totalDeAvaliacao++;
    }

    public double pegaMedia(){
        return somaDasValiacoes / totalDeAvaliacao;

    }

}
