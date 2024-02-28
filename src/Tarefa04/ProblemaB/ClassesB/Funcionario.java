package Tarefa04.ProblemaB.ClassesB;

public class Funcionario {
    private int matricula, idade;
    private String nome, cpf;
    private double salariobase;
    public Funcionario(int matricula, String nome, String cpf, int idade, double salariobase){
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salariobase = salariobase;
    }
    public int retornaMat(){
        return matricula;
    }
    public String retornaNome(){
        return nome;
    }
    public String retornaCPF(){
        return cpf;
    }
    public int retornaIdade(){
        return idade;
    }
    public double retornaSalarioBase(){
        return salariobase;
    }
}
