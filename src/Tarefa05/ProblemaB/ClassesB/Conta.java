package Tarefa05.ProblemaB.ClassesB;

public class Conta {
    private double saldo;
    public Conta(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void sacar(double valor){
        this.saldo -= valor;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
}
