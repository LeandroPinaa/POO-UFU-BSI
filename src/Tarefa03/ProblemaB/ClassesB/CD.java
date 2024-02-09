package Tarefa03.ProblemaB.ClassesB;

public class CD extends Item {
    private String cantor;
    private int nmr_faixas;
    public CD(String nome, String tipo, String genero, double preco, String cantor, int nmr_faixas){
        super(nome,tipo,genero,preco);
        this.cantor = cantor;
        this.nmr_faixas = nmr_faixas;
    }
    public String retornaCantor(){
        return cantor;
    }
    public int retornaNumeroFaixas(){
        return nmr_faixas;
    }
    public void MostrarDadosCD(){
        System.out.println("===========================");
        System.out.println("Nome do CD: "+retornaNome());
        System.out.println("Tipo: "+retornaTipo());
        System.out.println("Gênero: "+retornaGenero());
        System.out.format("Preço de locação: R$%.2f\n",retornaPreco());
        System.out.println("Nome do Cantor: "+this.cantor);
        System.out.println("Número de Faixas: "+this.nmr_faixas);
        System.out.println("===========================");
    }
}