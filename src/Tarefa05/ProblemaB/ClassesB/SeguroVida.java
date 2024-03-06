package Tarefa05.ProblemaB.ClassesB;

public class SeguroVida implements Tributavel {
    double valortotalpremio;
    public SeguroVida(double valortotalpremio){
        this.valortotalpremio = valortotalpremio;
    }
    public double calculaTributos(){
        return 42.0;
    }
    public double getValortotalpremio() {
        return valortotalpremio;
    }
    
}
