package Tarefa02.ProblemaC.ClassesC;
import java.util.Random;

public class NaveEspacial {
    private String nome;
    private int velocidade;
    public NaveEspacial(String s){
        nome = s;
        Random rd = new Random();
        velocidade = rd.nextInt(6)+5; //valor aleatorio de 0 a 5, dai adiciona 5 na resp
        //garantindo um valor aleatorio no intervalo [5,10]
    }
    public void MostrarNave(){
        System.out.println("Nome da Nave: ["+nome+"]");
        System.out.println("Velocidade: "+velocidade);
        if(velocidade==0) System.out.println("Nave inoperante.");    
    }
    public void alteraVelocidade(int vel){
        velocidade = vel;
    }
    public int getVelocidade(){
        return velocidade;
    }
}
