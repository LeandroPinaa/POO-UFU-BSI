package Tarefa04.ProblemaA.ClassesA;

public class Quadrado extends FormaBidimensional {
    private int lado;
    public Quadrado(String identificador, String cor, double x, double y, int lado){
        super(identificador, cor, x, y);
        this.lado = lado;
    }
    public int retornaLado(){
        return lado;
    }
    public int obterArea(){
        return lado*lado;
    }
    public void mostrar(){
        System.out.println("Forma: "+retornaId());
        System.out.println("Cor: "+retornaCor());
        System.out.println("Centro: ("+retornaX()+","+retornaY()+")");
        System.out.println("Lado: "+lado);
    }
}