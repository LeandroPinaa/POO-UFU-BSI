package Tarefa04.ProblemaB;
import java.util.Scanner;
import Tarefa04.ProblemaB.ClassesB.*;

public class B {
    static Funcionario[] f = new Funcionario[10];
    static int sz = 10;
    static int fc = 0;
    static int fn = 0;
    static double salariobase = 100;
    static double comissao = 0.05; //para os comissionados
    static double valorextra = 10; //para os noturnos, por noite
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int op = -1;
        //registro dos 10 funcionarios abaixo
        for(int i=0;i<sz;i++){
            System.out.print("Matricula: ");
            int matricula = sc.nextInt();
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("CPF: ");
            String cpf = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            while(true){
                System.out.println("Escolha o tipo do funcionario (1 - Comissionado, 2 - Noturno): ");
                op = sc.nextInt();
                if(op!=1 && op!=2){
                    System.out.println("Numero invalido.");
                    continue;
                }
                if(op==1){
                    f[i] = new FuncionarioComissionado(matricula, nome, cpf, idade, salariobase, comissao, 0);
                    fc++;
                }
                else{
                    f[i] = new FuncionarioNoturno(matricula, nome, cpf, idade, salariobase, valorextra, 0);
                    fn++;
                }
                break;
            }
        }
        while(op != 6){
            System.out.println("====== MENU ======");
            System.out.println("1 - Pesquisar Funcionario pelo CPF");
            System.out.println("2 - Pesquisar Funcionario pela Matricula");
            System.out.println("3 - Mostrar quantos funcionarios de cada categoria estão cadastrados");
            System.out.println("4 - Maior salario cada categoria");
            System.out.println("5 - Folha de pagamentos");
            System.out.println("6 - Encerrar programa");
            op = sc.nextInt();
            if(op==1){
                String cpf = sc.next();
                boolean flag = false;
                for(int i=0;i<sz;i++){
                    String b = f[i].retornaCPF();
                    if(cpf.equals(b)){
                        System.out.println("Funcionario de nome "+f[i].retornaNome()+" encontrado.");
                        flag = true;
                        break;
                    }
                }
                if(!flag) System.out.println("Funcionario não encontrado.");
            }
            else if(op==2){
                int matricula = sc.nextInt();
                boolean flag = false;
                for(int i=0;i<sz;i++){
                    int b = f[i].retornaMat();
                    if(matricula == b){
                        System.out.println("Funcionario de nome "+f[i].retornaNome()+" encontrado.");
                        flag = true;
                        break;
                    }
                }
                if(!flag) System.out.println("Funcionario não encontrado.");
            }
            else if(op==3){
                System.out.println("Quantidade de funcionarios comissionados: "+fc);
                System.out.println("Quantidade de funcionarios noturnos: "+fn);
            }
            else if(op==4){
                double maiorsalariofc = 0, maiorsalariofn = 0;
                for(int i=0;i<sz;i++){
                    if(f[i] instanceof FuncionarioComissionado){
                        FuncionarioComissionado ff = (FuncionarioComissionado) f[i];
                        if(ff.retornasalariototal() > maiorsalariofc){
                            maiorsalariofc = ff.retornasalariototal();
                        }
                    }
                    else{
                        FuncionarioNoturno ff = (FuncionarioNoturno) f[i];
                        if(ff.retornasalariototal() > maiorsalariofn){
                            maiorsalariofn = ff.retornasalariototal();
                        }
                    }
                }
                System.out.println("Maior salario dos funcionarios comissionados: "+maiorsalariofc);
                System.out.println("Maior salario dos funcionarios noturnos: "+maiorsalariofn);
            }
            else if(op==5){
                for(int i=0;i<sz;i++){
                    if(f[i] instanceof FuncionarioComissionado){
                        FuncionarioComissionado ff = (FuncionarioComissionado) f[i];
                        System.out.println("O funcionario "+ff.retornaNome()+" receberá esse mes "+ff.retornasalariototal());
                    }
                    else{
                        FuncionarioNoturno ff = (FuncionarioNoturno) f[i];
                        System.out.println("O funcionario "+ff.retornaNome()+" receberá esse mes "+ff.retornasalariototal());
                    }
                }
            }
        }
        sc.close();
    }
}
