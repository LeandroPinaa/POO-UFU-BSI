package Tarefa02.ProblemaA.ClassesA;

public class Reta {
    private double angular,linear;
    public Reta(double a,double b){
        angular = a;
        linear = b;
    }
    public double getAngular(){
        return angular;
    }
    public double getLinear(){
        return linear;
    }
    public void PertenceAReta(Ponto p){
        double x = p.retornaX();
        double y = p.retornaY();
        double value = (x*angular) + linear;
        if(y == value){
            System.out.println("O ponto ("+x+","+y+") pertence a reta.");
        }
        else{
            System.out.println("O ponto ("+x+","+y+") não pertence a reta.");
        }
    }
    public String RepresentReta(){
        String resp = "y = ";
        resp += angular;
        resp += "x + ";
        resp += linear;
        return resp;
    }
    public boolean ehParalela(Reta r){
        double angular2 = r.getAngular();
        if(angular == angular2) return true;
        else return false;
    }    
    public Ponto pontodeIntersecao(Reta r){
        if(ehParalela(r)){
            return null;   
        }
        else{ //3x + 2  | 5x + 7 | 3x+2 = 5x+7 | -5 = 2x 
            double first = linear - r.getLinear();
            double second = r.getAngular() - angular;
            double x = first/second;
            double y = ((x*angular) + linear);
            Ponto p2 = new Ponto(x,y);
            return p2;
        }
    }
}
