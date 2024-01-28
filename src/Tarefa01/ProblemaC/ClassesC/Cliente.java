package Tarefa01.ProblemaC.ClassesC;

public class Cliente {
    public static int ct = 0;
    public String nome, CPF, telefone;
    public int idade;
    public Conta conta;
        
    public String mostraDadosConta() {
        String r = "";
        r += conta.num+" ";
        r += nome+" ";
        r += conta.saldo;
        return r;
    }
    
    public void cadastraCliente(String n, String cpf, String t, int i, Conta c) {
        nome = n;
        CPF = cpf;
        telefone = t;
        idade = i;
        conta = c;
        ct++;
    }
    
    public boolean estaNegativado() {
        return conta.ehNegativo();
    }
    
}