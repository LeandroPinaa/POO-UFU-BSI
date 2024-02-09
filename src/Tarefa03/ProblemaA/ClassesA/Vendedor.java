package Tarefa03.ProblemaA.ClassesA;

public class Vendedor extends Funcionario {
    private double comissao;
    private int vendas;
    public Vendedor(String nome, String RG, int salario){
        super(nome,RG,salario);
        this.comissao = 0.05; //5%
        this.vendas = 0;
    }
    public double retornaSalarioTotalVendedor(){
        double ans = retornaSalario() + (comissao*vendas);
        return ans;
    }
    public void aumentaVendas(int vendas){
        this.vendas += vendas;
    }
    public void zeraVendas(){
        this.vendas = 0;
    }
}   
