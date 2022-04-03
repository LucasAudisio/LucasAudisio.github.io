import java.util.ArrayList;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        this.dia = 12;
        this.mes = 8;
        this.año = 1969;
    }

    public int getDia (){
        return dia;
    }

    public int getMes (){
        return mes;
    }

    public int getAño (){
        return año;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void Reiniciar(int d, int m, int a) {
        setDia( Normalizar(d, m, a).getDia());
        setMes( Normalizar(d, m, a).getMes());
        setAño( Normalizar(d, m, a).getAño());
    }

    public void Adelantar(int d, int m, int a) {
        setDia(Normalizar(getDia()+d, getMes()+m, getAño()+a).getDia());
        setMes(Normalizar(getDia()+d, getMes()+m, getAño()+a).getMes());
        setAño(Normalizar(getDia()+d, getMes()+m, getAño()+a).getAño());
    }

    public Fecha Normalizar(int d, int m, int a) {
        Fecha fechaNormalizada = new Fecha();
        if (m<1) m=1;
        while (m>12) {
            if (m>12) {
                m -= 12; a++;
            }
        }
        if (d<1) d=1;
        else if (d>diasDelMes(m-1)) {d = d-diasDelMes(m-1); m++;}
        if (a<1) a=1;
        fechaNormalizada.setDia(d);
        fechaNormalizada.setMes(m);
        fechaNormalizada.setAño(a);
        return fechaNormalizada;
    }

    public int diasDelMes (int M) {
        ArrayList<Integer> diasDeCadaMes = new ArrayList<Integer>();
        diasDeCadaMes.add(31);
        diasDeCadaMes.add(28);
        diasDeCadaMes.add(31);
        diasDeCadaMes.add(30);
        diasDeCadaMes.add(31);
        diasDeCadaMes.add(30);
        diasDeCadaMes.add(31);
        diasDeCadaMes.add(31);
        diasDeCadaMes.add(30);
        diasDeCadaMes.add(31);
        diasDeCadaMes.add(30);
        diasDeCadaMes.add(31);
        return (diasDeCadaMes.get(M));
    }

}
