package Tarefa03.ProblemaA.ClassesA;

public class Funcionario {
    private String nome;
    private String RG;
    private int salario;
    public Funcionario(String nome, String RG, int salario){
        this.nome = nome;
        this.RG = RG;
        this.salario = salario;
    }
    public String retornaNome(){
        return nome;
    }
    public String retornaRG(){
        return RG;
    }
    public int retornaSalario(){
        return salario;
    }
}
