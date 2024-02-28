package Tarefa04.ProblemaB.ClassesB;

public class FuncionarioNoturno extends Funcionario {
    private double valorextra;
    private int nmrnoitesmes;
    public FuncionarioNoturno(int matricula, String nome, String cpf, int idade, double salariobase, double valorextra, int nmrnoitesmes){
        super(matricula, nome, cpf, idade, salariobase); 
        this.valorextra = valorextra;
        this.nmrnoitesmes = nmrnoitesmes;
    }
    public double retornavalorextra(){
        return valorextra;
    }
    public int retornanmrnoitesmes(){
        return nmrnoitesmes;
    }
    public double retornasalariototal(){
        return retornaSalarioBase() + (valorextra*nmrnoitesmes);
    }
    public void aumentaNoitesTrabalhadas(int noitesamais){
        this.nmrnoitesmes += noitesamais;
    }
}