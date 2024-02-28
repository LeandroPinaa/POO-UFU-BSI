package Tarefa04.ProblemaA.ClassesA;

public class Cubo extends FormaTridimensional {
    private int lado;
    public Cubo(String identificador, String cor, double x, double y, double z, int lado){
        super(identificador, cor, x, y, z);
        this.lado = lado;
    }
    public int retornaLado(){
        return lado;
    }
    public double obterVolume(){
        return lado*lado*lado;
    }
    public void mostrar(){
        System.out.println("Forma: "+retornaId());
        System.out.println("Cor: "+retornaCor());
        System.out.println("Centro: ("+retornaX()+","+retornaY()+","+retornaZ()+")");
        System.out.println("Lado: "+lado);
    }
}