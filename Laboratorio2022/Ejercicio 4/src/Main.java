import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcion = 0;
        SistemaDeRegistroDePersonas sistema = new SistemaDeRegistroDePersonas();
        while(opcion != 7){
            System.out.println(" 1.registrar \n 2.Eliminar(DNI) \n 3.Modificar \n 4.MostrarMAyores \n 5.Mostrar \n 6.salir.");
            Scanner IngresoOpcion = new Scanner(System.in);
            opcion = IngresoOpcion.nextInt();
            if(opcion == 1){
                sistema.Registrar();
            }
            else if(opcion == 2){
                sistema.eliminarDNI();
            }
            else if(opcion == 3){
                sistema.Modificar();
            }
            else if(opcion == 4){
                sistema.mostrarMAyores();
            }
            else if(opcion == 5){
                sistema.mostrar();
            }
        }
        System.out.println("bye!");
    }
}