package Tarefa04.ProblemaA.ClassesA;

public class FormaTridimensional extends Forma {
    private double x,y,z;
    public FormaTridimensional(String identificador, String cor, double x, double y, double z){
        super(identificador,cor);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double retornaX(){
        return x;
    }
    public double retornaY(){
        return y;
    }
    public double retornaZ(){
        return z;
    }
}
