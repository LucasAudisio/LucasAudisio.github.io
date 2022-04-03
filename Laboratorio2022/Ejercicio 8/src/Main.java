import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha();

        //reiniciar:
        fecha1.Reiniciar(40, 1, 0);
        System.out.println(fecha1.getDia());
        System.out.println(fecha1.getMes());
        System.out.println(fecha1.getAño());

        //adelantar:
        fecha1.Adelantar(34, 52, 2046);
        System.out.println(fecha1.getDia());
        System.out.println(fecha1.getMes());
        System.out.println(fecha1.getAño());
    }
}
