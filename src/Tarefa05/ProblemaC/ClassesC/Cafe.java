package Tarefa05.ProblemaC.ClassesC;

public class Cafe implements Produto {
    //id, ano de produção, unidade de venda, categoria, preco, numero do lote
    private String id;
    private int anoproducao;
    private double preco;
    private String unidadedevenda,categoria;
    public Cafe(int numerolote, int idfazendaprodutora, int anoproducao, double preco, String categoria){
        int v = idfazendaprodutora+anoproducao+numerolote;
        this.id = "";
        this.id += v;
        this.anoproducao = anoproducao;
        this.preco = preco;
        this.unidadedevenda = "kg";
        this.categoria = categoria;
    }
    public String mostrarId() {
        return this.id;
    }
    public int mostrarAnoprod() {
        return this.anoproducao;
    }
    public String mostrarunidadevenda() {
        return this.unidadedevenda;
    }
    public String mostrarcategoria() {
        return this.categoria;
    }
    public double mostrarpreco() {
        return this.preco;
    }
}