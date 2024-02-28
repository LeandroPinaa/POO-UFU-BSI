package Tarefa04.ProblemaA.ClassesA;

public class Triangulo extends FormaBidimensional {
    private int base,altura;
    public Triangulo(String identificador, String cor, double x, double y, int base, int altura){
        super(identificador, cor, x, y);
        this.base = base;
        this.altura = altura;
    }
    public int retornaBase(){
        return base;
    }
    public int retornaAltura(){
        return altura;
    }
    public int obterArea(){
        return (base*altura)/2;
    }
    public void mostrar(){
        System.out.println("Forma: "+retornaId());
        System.out.println("Cor: "+retornaCor());
        System.out.println("Centro: ("+retornaX()+","+retornaY()+")");
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
    }
}