package Tarefa05.ProblemaB.ClassesB;

public class Cliente {
    private String nome,CPF;
    private Conta[] c = new Conta[2]; //conta poupanca e conta corrente
    private SeguroVida sv;
    private GerenciadorDeImpostoDeRenda g;
    public Cliente(String nome, String CPF, Conta[] c, SeguroVida sv, GerenciadorDeImpostoDeRenda g){
        this.nome = nome;
        this.CPF = CPF;
        this.c = c;
        this.sv = sv;
        this.g = g;
    }
    public String getCPF() {
        return CPF;
    }
    public String getNome() {
        return nome;
    }
    public Conta[] getC() {
        return c;
    }
    public SeguroVida getSv() {
        return sv;
    }
    public GerenciadorDeImpostoDeRenda getG() {
        return g;
    }
}
