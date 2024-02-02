package Tarefa02.ProblemaB.ClassesB;

public class Tempo {
    private int hora,minuto,segundo;
    public Tempo(int h, int m, int s){
        if(h>=0 && h<=23) hora = h;
        else hora = 0;
        if(m>=0 && m<=59) minuto = m;
        else minuto = 0;
        if(s>=0 && s<=59) segundo = s;
        else segundo = 0;
    }    
    public String DataFormatada(){
        String resp="";
        if(hora<10) resp += "0"+hora;
        else resp += hora;
        if(minuto<10) resp += "0"+minuto;
        else resp += minuto;
        if(segundo<10) resp += "0"+segundo;
        else resp += segundo;
        return resp;
    }
    public String DataFormatada2(){
        String resp="";
        if(hora<10) resp += "0"+hora;
        else resp += hora;
        resp += ":";
        if(minuto<10) resp += "0"+minuto;
        else resp += minuto;
        resp += ":";
        if(segundo<10) resp += "0"+segundo;
        else resp += segundo;
        if(hora < 11) resp += " AM";
        else resp += " PM";
        return resp;
    }
    public void incrementarMinuto(){ //1:00
        minuto++;
        if(minuto > 59){
            minuto = 0;
            incrementarHora();
        }
    }
    public void decrementarMinuto(){
        minuto--;
        if(minuto < 0){
            minuto = 59;
            hora--;
            if(hora<0) hora = 23;
        }
    }
    public void incrementarHora(){
        hora++;
        hora = hora%24;
    }
    public void decrementarHora(){
        hora--;
        if(hora < 0) hora = 23;
    }
    public void incrementarSegundo(){
        segundo++;
        if(segundo > 59){
            segundo = 0;
            incrementarMinuto();
        }
    }
    public void decrementarSegundo(){
        segundo--;
        if(segundo < 0){
            segundo = 59;
            minuto--;
            if(minuto<0) minuto = 59;
        }
    }
}
