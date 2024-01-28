package Tarefa01.ProblemaB;
import Tarefa01.ProblemaB.ClassesB.Circulo;
import Tarefa01.ProblemaB.ClassesB.Ponto;

public class B {
    public static void main(String a[]){
        Circulo c = new Circulo();
        Ponto p = new Ponto();
        p.iniciaPonto(2, 3);
        c.iniciaRaio(5);
        c.iniciaCentro(p);
        c.iniciaNome("circle");
        System.out.println("=============================\n");
        System.out.printf("Dados do circulo de raio %.2f\n",c.retornaRaio());
        System.out.printf("Diametro      : %.2f\n",c.calcularDiametro());
        System.out.printf("Circunferencia: %.2f\n",c.calcularPerimetro());
        System.out.printf("Area          : %.2f\n",c.calcularArea());
        System.out.println("\n=============================");
    }
}