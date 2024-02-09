package Tarefa03.ProblemaB.ClassesB;

public class DVD extends Item {
    private String[] atores = new String[10];
    private int qtd_atores;
    private String diretor;
    private int duracao; //em minutos
    public DVD(String nome, String tipo, String genero, double preco, String[] atores, String diretor, int duracao, int qtd_atores){
        super(nome,tipo,genero,preco);
        this.atores = atores;
        this.diretor = diretor;
        this.duracao = duracao;
        this.qtd_atores = qtd_atores;
    }
    public String[] retornaAtores(){
        return atores;
    }
    public String retornaDiretor(){
        return diretor;
    }
    public int retornaDuracao(){
        return duracao;
    }
    public int QuantidadeAtores(){
        return qtd_atores;
    }
    public void MostrarDadosDVD(){
        System.out.println("===========================");
        System.out.println("Nome do DVD: "+retornaNome());
        System.out.println("Tipo: "+retornaTipo());
        System.out.println("Gênero: "+retornaGenero());
        System.out.format("Preço de locação: R$%.2f\n",retornaPreco());
        System.out.println("Quantidade de Atores: "+this.qtd_atores);
        for(int i=0;i<qtd_atores;i++){
            System.out.println("Ator "+(i+1)+": "+this.atores[i]);
        }
        System.out.println("Nome do Diretor: "+this.diretor);
        System.out.println("Duração do DVD: "+this.duracao);
        System.out.println("===========================");
    }
}
