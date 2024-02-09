package Tarefa03.ProblemaA.ClassesA;

public class Administrativo extends Funcionario {
    private int horas_extras; //podem ganhar horas extras adicionais
    public Administrativo(String nome, String RG, int salario){
        super(nome,RG,salario);
        this.horas_extras = 0;
    }
    public double retornaSalarioTotalAdm(){
        int s = retornaSalario();
        double ans = s + ((s/100.0)*horas_extras);
        return ans;
    }
    public void aumentaHorasExtras(int horas_extras){
        this.horas_extras += horas_extras;
    }
    public void zeraHorasExtras(){
        this.horas_extras = 0;
    }
}
