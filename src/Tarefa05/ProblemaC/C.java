package Tarefa05.ProblemaC;
import java.util.Scanner;
import Tarefa05.ProblemaC.ClassesC.*;

public class C {
    static Produto[] p = new Produto[5];
    static int sz = 0;
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int op = -1;
        while(op != 4){
            System.out.println("1 - Adiciona Produto");
            System.out.println("2 - Qtd e preco total categoria (eletrodomestico/vinho/cafe)");
            System.out.println("3 - Total Geral produtos");
            System.out.println("4 - Encerrar programa");
            op = sc.nextInt();
            if(op == 1){
                int op2 = -1;
                while(true){
                    System.out.println("Escolha o produto:");
                    System.out.println("1 - Eletrodomestico");
                    System.out.println("2 - Vinho");
                    System.out.println("3 - Cafe");
                    op2 = sc.nextInt();
                    if(op2<1 || op2>3){
                        System.out.println("Número invalido.");
                        continue;
                    }
                    if(op2==1){
                        System.out.print("Marca: ");
                        String marca = sc.next();
                        System.out.print("Idfazendaprodutora: ");
                        int idfazendaprodutora = sc.nextInt();
                        System.out.print("Ano producao: ");
                        int anoproducao = sc.nextInt();
                        System.out.print("Preço: ");
                        double preco = sc.nextDouble();
                        p[sz] = new Eletrodomestico(marca, idfazendaprodutora, anoproducao, preco, "eletrodomestico");
                    }
                    if(op2==2){
                        System.out.print("Lote: ");
                        int lote = sc.nextInt();
                        System.out.print("Idfazendaprodutora: ");
                        int idfazendaprodutora = sc.nextInt();
                        System.out.print("Ano producao: ");
                        int anoproducao = sc.nextInt();
                        System.out.print("Preço: ");
                        double preco = sc.nextDouble();
                        p[sz] = new Vinho(lote, idfazendaprodutora, anoproducao, preco, "vinho");
                    }
                    if(op2==3){
                        System.out.print("Numero lote: ");
                        int numerolote = sc.nextInt();
                        System.out.print("Idfazendaprodutora: ");
                        int idfazendaprodutora = sc.nextInt();
                        System.out.print("Ano producao: ");
                        int anoproducao = sc.nextInt();
                        System.out.print("Preço: ");
                        double preco = sc.nextDouble();
                        p[sz] = new Cafe(numerolote, idfazendaprodutora, anoproducao, preco, "cafe");
                    }
                    sz++;
                    System.out.println("Produto cadastrado com sucesso.");
                    break;
                }
            }
            if(op == 2){
                System.out.print("Insira categoria: ");
                String categoria = sc.next();
                int qtd=0;
                double preco=0;
                for(int i=0;i<sz;i++){
                    if(categoria.equals(p[i].mostrarcategoria())){
                        preco += p[i].mostrarpreco();
                        qtd++;
                    }
                }
                System.out.println("Qtd total eh "+qtd+" e preco total eh "+preco);
            } 
            if(op == 3){
                double tot = 0;
                for(int i=0;i<sz;i++){
                    tot += p[i].mostrarpreco();
                }
                System.out.println("Total geral dos produtos ja inseridos eh "+tot);
            }
        }
        sc.close();
        //dada uma categoria informada pelo usuario, calcular a quantidade e o preço total da categoria informada
        //calcular o total geral dos produtos já inseridos
    }
}
