package Tarefa02.ProblemaB;
import Tarefa02.ProblemaB.ClassesB.Tempo;

public class B {
    public static void main(String a[]){
        Tempo t = new Tempo(0,0,1);
        while(true){ //testando todas as formas
            String s2 = t.DataFormatada2();
            System.out.println(s2);
            if(s2.equals("00:00:00 AM")) break;
            t.incrementarSegundo();
        }
    }    
}
