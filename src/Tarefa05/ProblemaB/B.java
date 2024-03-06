package Tarefa05.ProblemaB;
import Tarefa05.ProblemaB.ClassesB.*;

public class B {
    public static void main(String a[]){
        Conta[] c = new Conta[2];
        c[0] = new ContaCorrente(100);
        c[1] = new ContaPoupanca(50);
        SeguroVida sv = new SeguroVida(3000);
        GerenciadorDeImpostoDeRenda g = new GerenciadorDeImpostoDeRenda();
        Cliente cl = new Cliente("nome1","123",c,sv,g);
        cl.getG().adicionaprodutotributavel((ContaCorrente)c[0], ((ContaCorrente) c[0]).getsaldobruto());
        cl.getG().adicionaprodutotributavel(sv, sv.getValortotalpremio());
        double tot = cl.getG().totalTributos();
        System.out.format("Total de tributos a ser pago: R$%.2f\n",tot);
    }
}
