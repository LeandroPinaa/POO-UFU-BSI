package Tarefa02.ProblemaA;
import Tarefa02.ProblemaA.ClassesA.*;

public class A {
    public static void main(String a[]){
        Reta r = new Reta(3,2); //ex: y = 3x + 2
        Reta r2 = new Reta(5,7); //ex: y = 5x + 7
        Ponto p = new Ponto(5,7);
        r.PertenceAReta(p);
        String str = r.RepresentReta();
        System.out.println("Representação da reta: "+str);
        boolean ok = r.ehParalela(r2);
        if(ok) System.out.println("São paralelos.");
        else System.out.println("Nao são paralelos.");
        Ponto inter = r.pontodeIntersecao(r2);
        System.out.println("Interseção: ("+inter.retornaX()+","+inter.retornaY()+")");
    }
}
