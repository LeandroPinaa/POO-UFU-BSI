package Tarefa03.ProblemaB;
import java.util.Scanner;
import Tarefa03.ProblemaB.ClassesB.*;

public class B {
    static DVD[] d = new DVD[5];
    static CD[] c = new CD[5];
    static FitaVHS[] f = new FitaVHS[5];
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 5 DVDs: ");
        for(int i=0;i<5;i++){
            System.out.print("Nome DVD: ");
            String nome = sc.next();
            System.out.print("Tipo (audio ou video): ");
            String tipo = sc.next();
            System.out.print("Genero: ");
            String genero = sc.next();
            System.out.print("Preço de locação: ");
            double preco = sc.nextDouble();
            String[] atores = new String[10]; int n;
            while(true){
                System.out.print("Numero de atores (máximo de 10): ");
                n = sc.nextInt();
                if(n<=0 || n>10){
                    System.out.println("Quantidade invalida.");
                    continue;
                }
                for(int j=0;j<n;j++){
                    System.out.print("Nome do Ator "+(j+1)+": ");
                    String ator = sc.next();
                    atores[j] = ator;
                }
                break;
            }
            System.out.print("Nome do Diretor: ");
            String diretor = sc.next();
            System.out.print("Duração do DVD (em minutos): ");
            int duracao = sc.nextInt();
            d[i] = new DVD(nome, tipo, genero, preco, atores, diretor, duracao, n);            
        }
        for(int i=0;i<5;i++){
            d[i].MostrarDadosDVD();
        }
        for(int i=0;i<5;i++){
            System.out.print("Nome CD: ");
            String nome = sc.next();
            System.out.print("Tipo (audio ou video): ");
            String tipo = sc.next();
            System.out.print("Genero: ");
            String genero = sc.next();
            System.out.print("Preço de locação: ");
            double preco = sc.nextDouble();
            System.out.print("Nome Cantor: ");
            String cantor = sc.next();
            System.out.print("Número de Faixas: ");
            int nmr_faixas = sc.nextInt();
            c[i] = new CD(nome, tipo, genero, preco, cantor, nmr_faixas);
        }
        for(int i=0;i<5;i++){
            c[i].MostrarDadosCD();
        }
        for(int i=0;i<5;i++){
            System.out.print("Nome FitaVHS: ");
            String nome = sc.next();
            System.out.print("Tipo (audio ou video): ");
            String tipo = sc.next();
            System.out.print("Genero: ");
            String genero = sc.next();
            System.out.print("Preço de locação: ");
            double preco = sc.nextDouble();
            System.out.print("Está rebobinada (1 = sim, 0 = não): ");
            int rebobinada = sc.nextInt();
            f[i] = new FitaVHS(nome, tipo, genero, preco, rebobinada);
        }
        for(int i=0;i<5;i++){
            f[i].MostrarDadosFitaVHS();
        }
        double maior_preco = 0;
        String qual = "";
        for(int i=0;i<5;i++){
            if(d[i].retornaPreco() > maior_preco){
                maior_preco = d[i].retornaPreco();
                qual = "DVD";
            }
            if(c[i].retornaPreco() > maior_preco){
                maior_preco = c[i].retornaPreco();
                qual = "CD";
            }
            if(f[i].retornaPreco() > maior_preco){
                maior_preco = f[i].retornaPreco();
                qual = "FitaVHS";
            }
        }
        System.out.format("O item de maior preço é um/uma %s de custo R$%.2f\n",qual,maior_preco);
        sc.close();
    }
}