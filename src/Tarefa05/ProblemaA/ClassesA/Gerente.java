package Tarefa05.ProblemaA.ClassesA;

public class Gerente extends Funcionario {
    public Gerente(String nome, String matricula, double salario_base){
        super(nome,matricula,salario_base);
    }
    public double calculaSalario(){
        return getSalario_base()*2;
    }
}