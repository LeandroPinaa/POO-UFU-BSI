package Tarefa05.ProblemaA;
import Tarefa05.ProblemaA.ClassesA.*;

public class A {
    static Funcionario[] f = new Funcionario[5];
    public static void main(String a[]){
        f[0] = new Gerente("nome1","1a",100.10);
        f[1] = new Assistente("nome2","2a",50.5);
        f[2] = new Vendedor("nome3","3a",20,0.05);
        f[3] = new Gerente("nome4","4a",200.50);
        f[4] = new Assistente("nome5","5a",300);
        for(int i=0;i<5;i++){
            System.out.format("Funcionario %d recebeu R$%.2f\n",i+1,f[i].calculaSalario());
        }
        int qtd_gerente=0,qtd_assistente=0,qtd_vendedor=0;
        double media_gerente=0,media_assistente=0,media_vendedor=0;
        for(int i=0;i<5;i++){
            if(f[i] instanceof Gerente){
                qtd_gerente++;
                media_gerente += f[i].calculaSalario();
            }
            if(f[i] instanceof Assistente){
                qtd_assistente++;
                media_assistente += f[i].calculaSalario();
            }
            if(f[i] instanceof Vendedor){
                qtd_vendedor++;
                media_vendedor += f[i].calculaSalario();
            }
        }
        media_gerente = media_gerente/qtd_gerente;
        media_assistente = media_assistente/qtd_assistente;
        media_vendedor = media_vendedor/qtd_vendedor;
        System.out.format("Media salarial Gerente: R$%.2f\n",media_gerente);
        System.out.format("Media salarial Assistente: R$%.2f\n",media_assistente);
        System.out.format("Media salarial Vendedor: R$%.2f\n",media_vendedor);
    }
}
