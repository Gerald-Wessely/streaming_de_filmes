package br.com.alura.screenmatch.modelos;

public class Titulo {
    private boolean incluidoNoPlano;
    private int DuracaoEmMinutos;
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
    public void setDuracaoEmMinutos(int DuracaoEmMinutos) {
        this.DuracaoEmMinutos = DuracaoEmMinutos;
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

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return DuracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getSomaDasValiacoes() {
        return somaDasValiacoes;
    }

    public void setSomaDasValiacoes(double somaDasValiacoes) {
        this.somaDasValiacoes = somaDasValiacoes;
    }

    public void setTotalDeAvaliacao(int totalDeAvaliacao) {
        this.totalDeAvaliacao = totalDeAvaliacao;
    }
}
