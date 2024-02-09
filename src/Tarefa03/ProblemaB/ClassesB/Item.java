package Tarefa03.ProblemaB.ClassesB;

public class Item {
    private String nome;
    private String tipo; //audio ou video
    private String genero;
    private double preco; //preço da locação
    public Item(String nome, String tipo, String genero, double preco){
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.preco = preco;
    }
    public String retornaNome(){
        return nome;
    }
    public String retornaTipo(){
        return tipo;
    }
    public String retornaGenero(){
        return genero;
    }
    public double retornaPreco(){
        return preco;
    }
}
