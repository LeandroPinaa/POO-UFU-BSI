package Tarefa04.ProblemaA;
import java.util.Scanner;
import Tarefa04.ProblemaA.ClassesA.*;

public class A {
    static Forma[] f = new Forma[10];
    static int sz = 0;
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int op = -1;
        while(op != 6){
            System.out.println("1 - Cadastrar Forma");
            System.out.println("2 - Mostrar Descrição de Todas as Formas Cadastradas");
            System.out.println("3 - Mostrar Area Formas Bidimensionais Cadastradas");
            System.out.println("4 - Mostrar Volume Formas Tridimensionais Cadastradas");
            System.out.println("5 - Existe duas esferas ou circulos que se interceptam ou não");
            System.out.println("6 - Encerrar programa");
            op = sc.nextInt();
            if(op == 1){
                if(sz>=10){
                    System.out.println("Limite de formas atingido.");
                    continue;
                }
                int op2 = -1;
                while(true){
                    System.out.println("Escolha o tipo de forma a ser cadastrada:");
                    System.out.println("1 - Quadrado");
                    System.out.println("2 - Círculo");
                    System.out.println("3 - Triângulo");
                    System.out.println("4 - Esfera");
                    System.out.println("5 - Cubo");
                    System.out.println("6 - Tetraedro");
                    op2 = sc.nextInt();
                    if(op2<1 || op2>6){
                        System.out.println("Número invalido.");
                        continue;
                    }
                    if(op2==1){
                        System.out.print("Cor: ");
                        String cor = sc.next();
                        System.out.print("X: ");
                        double x = sc.nextDouble();
                        System.out.print("Y: ");
                        double y = sc.nextDouble();
                        System.out.print("Lado: ");
                        int lado = sc.nextInt();
                        f[sz] = new Quadrado("quadrado",cor,x,y,lado);
                    }
                    else if(op2==2){
                        System.out.print("Cor: ");
                        String cor = sc.next();
                        System.out.print("X: ");
                        double x = sc.nextDouble();
                        System.out.print("Y: ");
                        double y = sc.nextDouble();
                        System.out.print("Raio: ");
                        double raio = sc.nextDouble();
                        f[sz] = new Circulo("circulo", cor, x, y, raio);
                    }
                    else if(op2==3){
                        System.out.print("Cor: ");
                        String cor = sc.next();
                        System.out.print("X: ");
                        double x = sc.nextDouble();
                        System.out.print("Y: ");
                        double y = sc.nextDouble();
                        System.out.print("Base: ");
                        int base = sc.nextInt();
                        System.out.print("Altura: ");
                        int altura = sc.nextInt();
                        f[sz] = new Triangulo("triangulo", cor, x, y, base, altura);
                    }
                    else if(op2==4){
                        System.out.print("Cor: ");
                        String cor = sc.next();
                        System.out.print("X: ");
                        double x = sc.nextDouble();
                        System.out.print("Y: ");
                        double y = sc.nextDouble();
                        System.out.print("Z: ");
                        double z = sc.nextDouble();
                        System.out.print("Raio: ");
                        double raio = sc.nextDouble();
                        f[sz] = new Esfera("esfera", cor, x, y, z, raio);
                    }
                    else if(op2==5){
                        System.out.print("Cor: ");
                        String cor = sc.next();
                        System.out.print("X: ");
                        double x = sc.nextDouble();
                        System.out.print("Y: ");
                        double y = sc.nextDouble();
                        System.out.print("Z: ");
                        double z = sc.nextDouble();
                        System.out.print("Lado: ");
                        int lado = sc.nextInt();
                        f[sz] = new Cubo("cubo", cor, x, y, z, lado);
                    }
                    else if(op2==6){
                        System.out.print("Cor: ");
                        String cor = sc.next();
                        System.out.print("X: ");
                        double x = sc.nextDouble();
                        System.out.print("Y: ");
                        double y = sc.nextDouble();
                        System.out.print("Z: ");
                        double z = sc.nextDouble();
                        System.out.print("Base: ");
                        int base = sc.nextInt();
                        System.out.print("Altura da Base: ");
                        int altura_da_base = sc.nextInt();
                        System.out.print("Altura: ");
                        int altura = sc.nextInt();
                        f[sz] = new Tetraedro("tetraedro", cor, x, y, z, base, altura_da_base, altura);
                    }
                    sz++;
                    System.out.println("Forma cadastrada com sucesso.");
                    break;
                }
            }
            else if(op == 2){
                for(int i=0;i<sz;i++){
                    String b = f[i].retornaId(); //necessário para o typecast
                    if(b.equals("quadrado")){
                        Quadrado ff = (Quadrado) f[i];
                        ff.mostrar();
                    }
                    if(b.equals("circulo")){
                        Circulo ff = (Circulo) f[i];
                        ff.mostrar();
                    }
                    if(b.equals("triangulo")){
                        Triangulo ff = (Triangulo) f[i];
                        ff.mostrar();
                    }
                    if(b.equals("esfera")){
                        Esfera ff = (Esfera) f[i];
                        ff.mostrar();
                    }
                    if(b.equals("cubo")){
                        Cubo ff = (Cubo) f[i];
                        ff.mostrar();
                    }
                    if(b.equals("tetraedro")){
                        Tetraedro ff = (Tetraedro) f[i];
                        ff.mostrar();
                    } System.out.println();
                }
            }
            else if(op == 3){
                for(int i=0;i<sz;i++){
                    String b = f[i].retornaId();
                    if(b.equals("circulo")){
                        Circulo ff = (Circulo) f[i];
                        double area = ff.obterArea();
                        System.out.println("Area do "+b+" é "+area);
                    }
                    if(b.equals("quadrado")){
                        Quadrado ff = (Quadrado) f[i];
                        double area = ff.obterArea();
                        System.out.println("Area do "+b+" é "+area);
                    }
                    if(b.equals("triangulo")){
                        Triangulo ff = (Triangulo) f[i];
                        double area = ff.obterArea();
                        System.out.println("Area do "+b+" é "+area);
                    }
                }
            }
            else if(op == 4){
                for(int i=0;i<sz;i++){
                    String b = f[i].retornaId();
                    if(b.equals("esfera")){
                        Esfera ff = (Esfera) f[i];
                        double volume = ff.obterVolume();
                        System.out.println("Volume do "+b+" é "+volume);
                    }
                    if(b.equals("cubo")){
                        Cubo ff = (Cubo) f[i];
                        double volume = ff.obterVolume();
                        System.out.println("Volume do "+b+" é "+volume);
                    }
                    if(b.equals("tetraedro")){
                        Tetraedro ff = (Tetraedro) f[i];
                        double volume = ff.obterVolume();
                        System.out.println("Volume do "+b+" é "+volume);
                    }
                }
            }
            else if(op == 5){
                boolean flag = false;
                for(int i=0;i<sz;i++){
                    for(int j=i+1;j<sz;j++){
                        String bi = f[i].retornaId();
                        String bj = f[j].retornaId();
                        if(bi.equals("circulo") && bj.equals("circulo")){
                            Circulo c1 = (Circulo) f[i];
                            Circulo c2 = (Circulo) f[j];
                            double distancia = Math.sqrt(Math.pow(c2.retornaX() - c1.retornaX(), 2) + Math.pow(c2.retornaY() - c1.retornaY(), 2));
                            if(distancia < c1.retornaRaio() + c2.retornaRaio()){
                                flag = true;
                                break;
                            }
                        }
                        else if(bi.equals("esfera") && bj.equals("esfera")){
                            Esfera e1 = (Esfera) f[i];
                            Esfera e2 = (Esfera) f[j];
                            double distancia = Math.sqrt(Math.pow(e2.retornaX() - e1.retornaX(), 2) + Math.pow(e2.retornaY() - e1.retornaY(), 2) + Math.pow(e2.retornaZ() - e1.retornaZ(), 2));
                            if(distancia < e1.retornaRaio() + e2.retornaRaio()){
                                flag = true;
                                break;
                            }
                        }
                    }
                }
                if(flag) System.out.println("Existe.");
                else System.out.println("Não Existe.");
            }
        }
        sc.close();
    }   

}
