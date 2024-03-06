package Tarefa05.ProblemaC.ClassesC;

public class Vinho implements Produto {
    //id, ano de produção, unidade de venda, categoria, preco, numero do lote
    private String id;
    private int anoproducao;
    private double preco;
    private String unidadedevenda,categoria;
    public Vinho(int lote, int idfazendaprodutora, int anoproducao, double preco, String categoria){
        this.id = "";
        this.id += lote;
        this.anoproducao = anoproducao;
        this.preco = preco+20.0*(anoproducao-2);
        this.unidadedevenda = "L";
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