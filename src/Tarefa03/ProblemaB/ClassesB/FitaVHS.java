package Tarefa03.ProblemaB.ClassesB;

public class FitaVHS extends Item {
    private int rebobinada; //1 = true, 0 = false
    public FitaVHS(String nome, String tipo, String genero, double preco, int rebobinada){   
        super(nome,tipo,genero,preco);
        this.rebobinada = rebobinada;
    }
    public int estaRebobinada(){
        return rebobinada;
    }
    public void MostrarDadosFitaVHS(){
        System.out.println("===========================");
        System.out.println("Nome do CD: "+retornaNome());
        System.out.println("Tipo: "+retornaTipo());
        System.out.println("Gênero: "+retornaGenero());
        System.out.format("Preço de locação: R$%.2f\n",retornaPreco());
        System.out.println("Rebobinada (1=sim, 0=não): "+this.rebobinada);
        System.out.println("===========================");
    }
}
