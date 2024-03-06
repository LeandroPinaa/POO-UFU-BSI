package Tarefa05.ProblemaB.ClassesB;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo){
        super(saldo);
    }
    public double getsaldobruto(){
        return getSaldo();
    }
    public double getsaldoliquido(){
        return getSaldo();
    }
}