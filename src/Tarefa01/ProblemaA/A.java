package Tarefa01.ProblemaA;
import Tarefa01.ProblemaA.ClassesA.Ponto;

public class A {
    public static void main(String a[]){
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        float x1=2,y1=3,x2=5,y2=7;
        p1.iniciaPonto(x1, y1);
        p2.iniciaPonto(x2, y2);
        float distancia = p1.distanciaEuclidiana(p1, p2);
        System.out.println("Distancia entre pontos p1 e p2 é: "+distancia);
        System.out.println("Alterando os valores...");
        x1=5; y1=7; x2=2; y2=7;
        p1.iniciaPonto(x1, y1);
        p2.iniciaPonto(x2, y2);
        System.out.println("O novo valor do X e Y do Ponto 1 é ("+p1.retornaX()+","+p1.retornaY()+")");
        System.out.println("O novo valor do X e Y do Ponto 2 é ("+p2.retornaX()+","+p2.retornaY()+")");        
    }
}
