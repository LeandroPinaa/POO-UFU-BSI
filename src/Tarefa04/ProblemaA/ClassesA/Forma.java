package Tarefa04.ProblemaA.ClassesA;

public class Forma {
    String identificador;
    String cor;
    public Forma(String identificador, String cor){
        this.identificador = identificador;
        this.cor = cor;
    }
    public String retornaId(){
        return identificador;
    }
    public String retornaCor(){
        return cor;
    }
}
