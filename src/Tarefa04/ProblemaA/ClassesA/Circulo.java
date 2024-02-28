package Tarefa04.ProblemaA.ClassesA;

public class Circulo extends FormaBidimensional {
    private double raio;
    public Circulo(String identificador, String cor, double x, double y, double raio){
        super(identificador, cor, x, y);
        this.raio = raio;
    }
    public double retornaRaio(){
        return raio;
    }
    public double obterArea(){
        return raio*raio*Math.PI;
    }
    public void mostrar(){
        System.out.println("Forma: "+retornaId());
        System.out.println("Cor: "+retornaCor());
        System.out.println("Centro: ("+retornaX()+","+retornaY()+")");
        System.out.println("Raio: "+raio);
    }
}
