package Tarefa05.ProblemaA.ClassesA;

public abstract class Funcionario {
    private String nome,matricula;
    private double salario_base;
    public Funcionario(String nome, String matricula, double salario_base){
        this.nome = nome;
        this.matricula = matricula;
        if(salario_base<0){
            this.salario_base = 0;
        }
        else this.salario_base = salario_base;   
    }
    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario_base() {
        return salario_base;
    }
    public abstract double calculaSalario();
}
