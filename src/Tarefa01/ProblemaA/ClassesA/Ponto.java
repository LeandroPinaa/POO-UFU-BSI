package Tarefa01.ProblemaA.ClassesA;

public class Ponto {
    private float x,y;
    
    public void setarX(float value){ //funciona como método que altera
        if(value<0) x = 0;
        else x = value;
    }
    public void setarY(float value){ //funciona como método que altera
        if(value<0) y = 0;
        else y = value;
    }
    public void iniciaPonto(float value1, float value2){
        setarX(value1);
        setarY(value2);   
    }
    public float retornaX(){
        return x;
    }
    public float retornaY(){
        return y;
    }
    public float distanciaEuclidiana(Ponto a, Ponto b){
        float dx = a.x - b.x;
        float dy = a.y - b.y;
        float ans = dx*dx + dy*dy;
        ans = (float)Math.sqrt(ans); //math.sqrt(x) retorna um double, necessario conversão
        return ans;
    }
}
