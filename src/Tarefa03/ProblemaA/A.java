package Tarefa03.ProblemaA;
import java.util.Scanner;
import Tarefa03.ProblemaA.ClassesA.*;

public class A {
    static Vendedor[] v = new Vendedor[5];
    static Administrativo[] a = new Administrativo[5];
    static double INF = 9999999999.0;
    public static void main(String a2[]){
        Scanner sc = new Scanner(System.in);
        int op = -1;
        int sz_v=0, sz_a=0;
        while(op != 9){
            System.out.println("====== MENU ======");
            System.out.println("1 - Adicionar Vendedor");
            System.out.println("2 - Adicionar Administrador");
            System.out.println("3 - Funcionário de Maior Salário");
            System.out.println("4 - Funcionário de Menor Salário");
            System.out.println("5 - Folha de Pagamento Mensal");
            System.out.println("6 - Média Salarial");
            System.out.println("7 - Adicionar Vendas");
            System.out.println("8 - Adicionar Horas Extras");
            System.out.println("9 - Encerrar");
            op = sc.nextInt();
            if(op == 1){
                if(sz_v==5){
                    System.out.println("Não há mais vagas para vendedores.");
                    continue;
                }
                String nome,RG;
                int salario;
                System.out.print("Nome: ");
                nome = sc.next();
                System.out.print("RG: ");
                RG = sc.next();
                System.out.print("Salario: ");
                salario = sc.nextInt();
                v[sz_v++] = new Vendedor(nome,RG,salario); 
            }
            else if(op==2){
                if(sz_a==5){
                    System.out.println("Não há mais vagas para vendedores.");
                    continue;
                }
                String nome,RG;
                int salario;
                System.out.print("Nome: ");
                nome = sc.next();
                System.out.print("RG: ");
                RG = sc.next();
                System.out.print("Salario: ");
                salario = sc.nextInt();
                a[sz_a++] = new Administrativo(nome,RG,salario);
            }
            else if(op == 3){
                double max = 0;
                for(int i=0;i<sz_v;i++){
                    double s = v[i].retornaSalarioTotalVendedor();
                    if(s > max) max = s;
                }
                for(int i=0;i<sz_a;i++){
                    double s = a[i].retornaSalarioTotalAdm();
                    if(s > max) max = s;
                }
                System.out.format("Maior salario ganho: R$%.2f\n",max);
                System.out.println("Funcionario(s) de maior salario: ");
                for(int i=0;i<sz_v;i++){
                    double s = v[i].retornaSalarioTotalVendedor();
                    double dif = s-max; if(dif<0) dif *= -1;
                    if(dif < 1e-9){ //entra nesse if se s == max, verificação dessa forma pois com double há imprecisões de valores
                        System.out.println("Tipo: Vendedor");
                        System.out.println("Nome: "+v[i].retornaNome());
                        System.out.println("RG: "+v[i].retornaRG());
                        System.out.format("Salario: R$%.2f\n", v[i].retornaSalarioTotalVendedor());
                    }
                }
                for(int i=0;i<sz_a;i++){
                    double s = a[i].retornaSalarioTotalAdm();
                    double dif = s-max; if(dif<0) dif *= -1;
                    if(dif < 1e-9){ //entra nesse if se s == max, verificação dessa forma pois com double há imprecisões de valores
                        System.out.println("Tipo: Administrador");
                        System.out.println("Nome: "+a[i].retornaNome());
                        System.out.println("RG: "+a[i].retornaRG());
                        System.out.format("Salario: R$%.2f\n", a[i].retornaSalarioTotalAdm());
                    }
                }
            }
            else if(op == 4){
                double min = INF;
                for(int i=0;i<sz_v;i++){
                    double s = v[i].retornaSalarioTotalVendedor();
                    if(s < min) min = s;
                }
                for(int i=0;i<sz_a;i++){
                    double s = a[i].retornaSalarioTotalAdm();
                    if(s < min) min = s;
                }
                System.out.format("Menor salario ganho: R$%.2f\n",min);
                System.out.println("Funcionario(s) de menor salario: ");
                for(int i=0;i<sz_v;i++){
                    double s = v[i].retornaSalarioTotalVendedor();
                    double dif = s-min; if(dif<0) dif *= -1;
                    if(dif < 1e-9){ //entra nesse if se s == min, verificação dessa forma pois com double há imprecisões de valores
                        System.out.println("Tipo: Vendedor");
                        System.out.println("Nome: "+v[i].retornaNome());
                        System.out.println("RG: "+v[i].retornaRG());
                        System.out.format("Salario: R$%.2f\n", v[i].retornaSalarioTotalVendedor());
                    }
                }
                for(int i=0;i<sz_a;i++){
                    double s = a[i].retornaSalarioTotalAdm();
                    double dif = s-min; if(dif<0) dif *= -1;
                    if(dif < 1e-9){ //entra nesse if se s == min, verificação dessa forma pois com double há imprecisões de valores
                        System.out.println("Tipo: Administrador");
                        System.out.println("Nome: "+a[i].retornaNome());
                        System.out.println("RG: "+a[i].retornaRG());
                        System.out.format("Salario: R$%.2f\n", a[i].retornaSalarioTotalAdm());
                    }
                }
            }
            else if(op==5){
                System.out.println("==== Folha de Pagamento Mensal ====");
                for(int i=0;i<sz_v;i++){
                    System.out.println("Tipo: Vendedor");
                    System.out.println("Nome: "+v[i].retornaNome());
                    System.out.println("RG: "+v[i].retornaRG());
                    System.out.format("Salario: R$%.2f\n", v[i].retornaSalarioTotalVendedor());
                    v[i].zeraVendas();
                }
                for(int i=0;i<sz_a;i++){
                    System.out.println("Tipo: Administrador");
                    System.out.println("Nome: "+a[i].retornaNome());
                    System.out.println("RG: "+a[i].retornaRG());
                    System.out.format("Salario: R$%.2f\n", a[i].retornaSalarioTotalAdm());
                    a[i].zeraHorasExtras();
                }
            }
            else if(op==6){
                double media = 0;
                for(int i=0;i<sz_v;i++){
                    double s = v[i].retornaSalarioTotalVendedor();
                    media += s;
                }
                for(int i=0;i<sz_a;i++){
                    double s = a[i].retornaSalarioTotalAdm();
                    media += s;
                }
                media /= (sz_v+sz_a);
                System.out.format("Media salarial: R$%.2f\n",media);
            }
            else if(op==7){
                System.out.println("Adicione as vendas de cada vendedor: ");
                for(int i=0;i<sz_v;i++){
                    System.out.print("Vendedor "+(i+1)+": ");
                    int vendas = sc.nextInt();
                    v[i].aumentaVendas(vendas);
                }
            }
            else if(op==8){
                System.out.println("Adicione as horas extras de cada administrador: ");
                for(int i=0;i<sz_a;i++){
                    System.out.print("Administrador "+(i+1)+": ");
                    int horas = sc.nextInt();
                    a[i].aumentaHorasExtras(horas);
                }
            }
        }
        sc.close();
    }
}
