package Tarefa04.ProblemaB.ClassesB;

public class FuncionarioComissionado extends Funcionario {
    private int vendas;
    private double comissao;
    public FuncionarioComissionado(int matricula, String nome, String cpf, int idade, double salariobase, double comissao, int vendas){
        super(matricula, nome, cpf, idade, salariobase); 
        this.comissao = comissao;  
        this.vendas = vendas;
    } 
    public int retornavendas(){
        return vendas;
    }
    public double retornacomissao(){
        return comissao;
    }
    public double retornasalariototal(){
        return retornaSalarioBase() + (vendas*comissao);
    }
    public void aumentaVendas(int vendas){
        this.vendas += vendas;
    }
}