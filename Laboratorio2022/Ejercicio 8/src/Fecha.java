import java.util.Arrays;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(){
        this.dia = 1;
        this.mes = 1;
        this.año = 1;
    }

    // Getters

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAño(){
        return this.año;
    }

    // Setters

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAño(int año){
        this.año = año;
    }

    public void reiniciarFecha(){
        this.dia = 0;
        this.mes = 0;
        this.año = 0;
    }

    public void adelantarFecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void imprimirFecha(){
        System.out.println("Fecha: " + this.dia + " / " + this.mes + " / " + this.año);
    }

    public int cantDias(int mes){
        if(Arrays.asList(1, 3, 5, 7, 8, 10, 12).contains(mes)){
            return 31;
        }
        else if(mes == 2) return 28;
        else return 30;
    }

    public void normalizarFecha(){
        if(mes < 0) mes = 0;
        else if(mes > 12) mes = 12;

        if(dia < 0) dia = 0;
        else if(dia > cantDias(mes)) dia = cantDias(mes);

        if(año < 0) año = 0;
    }
}