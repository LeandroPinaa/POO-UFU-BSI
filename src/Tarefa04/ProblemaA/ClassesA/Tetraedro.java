package Tarefa04.ProblemaA.ClassesA;

public class Tetraedro extends FormaTridimensional {
    private int base,altura_da_base,altura;
    public Tetraedro(String identificador, String cor, double x, double y, double z, int base, int altura_da_base, int altura){
        super(identificador, cor, x, y, z);
        this.base = base;
        this.altura = altura;
        this.altura_da_base = altura_da_base;
    }
    public int retornaBase(){
        return base;
    }
    public int retornaAlturaBase(){
        return altura_da_base;
    }
    public int retornaAltura(){
        return altura;
    }
    public double obterVolume(){
        return ((altura_da_base * base)/2.0)*altura*(1.0/3.0);
    }
    public void mostrar(){
        System.out.println("Forma: "+retornaId());
        System.out.println("Cor: "+retornaCor());
        System.out.println("Centro: ("+retornaX()+","+retornaY()+","+retornaZ()+")");
        System.out.println("Base: "+base);
        System.out.println("Altura da base: "+altura_da_base);
        System.out.println("Altura: "+altura);
    }
}