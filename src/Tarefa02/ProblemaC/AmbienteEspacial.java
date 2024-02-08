package Tarefa02.ProblemaC;
import java.util.Scanner;
import Tarefa02.ProblemaC.ClassesC.NaveEspacial;

public class AmbienteEspacial {
    static NaveEspacial[] v = new NaveEspacial[5];
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int sz = 0;
        int op = -1;
        while(op != 5){
            System.out.println("=== MENU ESPACIAL ===");
            System.out.println("1 - Criar Nave");
            System.out.println("2 - Parar Nave X");
            System.out.println("3 - Ligar Nave X");
            System.out.println("4 - Mostrar Naves");
            System.out.println("5 - Encerrar");
            op = sc.nextInt();
            if(op == 1){
                if(sz<=5){                    
                    System.out.print("Insira o nome da sua nave: ");
                    String s = sc.next();
                    v[sz] = new NaveEspacial(s);
                    sz++;
                }   
                else System.out.println("Limite de naves atingido.");
            }
            if(op == 2){
                int qtd=0;
                for(int i=0;i<sz;i++){
                    if(v[i].getVelocidade()==0) qtd++;
                }
                if(qtd == sz){
                    System.out.println("Todas as naves já estão paradas. Tente outro comando.");
                    continue;
                }
                System.out.println("As naves em movimento são: ");
                for(int i=0;i<sz;i++){
                    if(v[i].getVelocidade()>0){
                        System.out.println("Nave "+(i+1));
                        v[i].MostrarNave();
                        System.out.println();
                    }
                }
                while(true){
                    System.out.print("Insira o número da nave escolhida para pará-la: ");
                    int op2 = sc.nextInt();
                    op2--;
                    if(op2>=sz){
                        System.out.println("Essa nave não existe.");
                        continue;
                    }
                    if(v[op2].getVelocidade()>0){
                        System.out.println("Nave parada: ");
                        v[op2].alteraVelocidade(0);
                        v[op2].MostrarNave();
                        break;
                    }
                    else System.out.println("Essa nave já está parada.");
                }
            }
            if(op == 3){
                int qtd=0;
                for(int i=0;i<sz;i++){
                    if(v[i].getVelocidade()>0) qtd++;
                }
                if(qtd == sz){
                    System.out.println("Todas as naves já estão em movimento. Tente outro comando.");
                    continue;
                }
                System.out.println("As naves paradas são: ");
                for(int i=0;i<sz;i++){
                    if(v[i].getVelocidade()==0){
                        System.out.println("Nave "+(i+1));
                        v[i].MostrarNave();
                        System.out.println();
                    }
                }
                while(true){
                    System.out.print("Insira o número da nave escolhida para ligá-la: ");
                    int op2 = sc.nextInt();
                    op2--;
                    if(op2>=sz){
                        System.out.println("Essa nave não existe.");
                        continue;
                    }
                    if(v[op2].getVelocidade()==0){
                        int vel;
                        while(true){
                            System.out.print("Insira a velocidade de iniciação da nave: ");
                            vel = sc.nextInt();
                            if(vel<=0) System.out.println("Valor invalido.");
                            else break;
                        }
                        System.out.println("Nave Ligada: ");
                        v[op2].alteraVelocidade(vel);
                        v[op2].MostrarNave();
                        break;
                    }
                    else System.out.println("Essa nave já está em movimento.");
                }
            }
            if(op==4){
                System.out.println("As naves existentes são: ");
                for(int i=0;i<sz;i++){
                    v[i].MostrarNave();
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
