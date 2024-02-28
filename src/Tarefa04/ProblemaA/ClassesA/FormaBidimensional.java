package Tarefa04.ProblemaA.ClassesA;

public class FormaBidimensional extends Forma {
    private double x,y;
    public FormaBidimensional(String identificador, String cor, double x, double y){
        super(identificador,cor);
        this.x = x;
        this.y = y;
        
    }
    public double retornaX(){
        return x;
    }
    public double retornaY(){
        return y;
    }
}