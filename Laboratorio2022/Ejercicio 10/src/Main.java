import java.util.ArrayList;

public class Main {
    static public void main(String[] args){
        Hijo hijoTemp1 = new Hijo();
        hijoTemp1.setEdad(5);
        Hijo hijoTemp2 = new Hijo();
        hijoTemp2.setEdad(18);
        Hijo hijoTemp3 = new Hijo();
        hijoTemp3.setEdad(17);

        ArrayList<Hijo> hijosTemp = new ArrayList<>();
        hijosTemp.add(hijoTemp1);
        hijosTemp.add(hijoTemp2);
        hijosTemp.add(hijoTemp3);

        Madre madreTemp = new Madre("nombre", 44, 214123, 325235, "apellido", "empresa", hijosTemp);
        System.out.println(madreTemp.getHijos());
        ArrayList<Hijo> hijosMenores = new ArrayList<>();
        hijosMenores = madreTemp.hijosMenores();

        for(Hijo hijoActual:hijosMenores) System.out.println(hijoActual.getEdad());
        System.out.println("---------");
        for(Hijo hijoActual:madreTemp.getHijos()) System.out.println(hijoActual.getEdad());
    }
}
