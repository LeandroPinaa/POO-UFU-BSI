package Tarefa04.ProblemaA.ClassesA;

public class Esfera extends FormaTridimensional {
    private double raio;
    public Esfera(String identificador, String cor, double x, double y, double z, double raio){
        super(identificador, cor, x, y, z);
        this.raio = raio;
    }
    public double retornaRaio(){
        return raio;
    }
    public double obterVolume(){
        return (4.0/3.0) * Math.PI * raio * raio * raio;
    }
    public void mostrar(){
        System.out.println("Forma: "+retornaId());
        System.out.println("Cor: "+retornaCor());
        System.out.println("Centro: ("+retornaX()+","+retornaY()+","+retornaZ()+")");
        System.out.println("Raio: "+raio);
    }
}