package Tarefa05.ProblemaB.ClassesB;

public class GerenciadorDeImpostoDeRenda {
    private int sz;
    private Tributavel[] t = new Tributavel[5];
    public GerenciadorDeImpostoDeRenda(){
        this.sz = 0;
    }
    public void adicionaprodutotributavel(Tributavel tt, double saldo){
        if(tt instanceof ContaCorrente){
            t[sz] = new ContaCorrente(saldo);
        }
        else{
            t[sz] = new SeguroVida(saldo); //totalpremio
        }
        sz++;
    }
    public double totalTributos(){
        double tot = 0;
        for(int i=0;i<sz;i++){
            tot += t[i].calculaTributos();
        }
        return tot;
    }
}
