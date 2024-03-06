package Tarefa05.ProblemaB.ClassesB;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(double saldo){
        super(saldo);
    }
    public double calculaTributos(){
        return getSaldo()*0.01;
    }
    public double getsaldobruto(){
        return getSaldo();
    }
    public double getsaldoliquido(){
        return getSaldo() - calculaTributos();
    }
}