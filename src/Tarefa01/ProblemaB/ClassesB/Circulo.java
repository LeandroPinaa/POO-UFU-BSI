package Tarefa01.ProblemaB.ClassesB;

public class Circulo {
    private float raio;
    private String nome;
    private Ponto Centro = new Ponto();
    public void iniciaRaio(int r){
        raio = r;
    }
    public void iniciaCentro(Ponto p){
        Centro.iniciaPonto(p.retornaX(),p.retornaY());
    }
    public void iniciaNome(String a){
        if(a!="") nome = a;
    }
    public float calcularDiametro(){
        return 2*raio;
    }
    public float calcularPerimetro(){
        float pi = (float)Math.PI;
        return 2*pi*raio;
    }
    public float calcularArea(){
        float pi = (float)Math.PI;
        return pi*raio*raio;
    }
    public String retornaNome(){
        return nome;
    }
    public float retornaRaio(){
        return raio;
    }
}