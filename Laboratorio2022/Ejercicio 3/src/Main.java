import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float precioActual = 0;
        String nombreTemp;
        float precioTemp;
        boolean insertarOtraCosa = true;
        String respuesta;
//drakul top
        while (insertarOtraCosa) {
            System.out.println("Escriba el nombre del producto");

            Scanner ingresaNombre = new Scanner(System.in);
            nombreTemp = ingresaNombre.nextLine();

            System.out.println("Indique su precio");

            Scanner ingresaPrecio = new Scanner(System.in);
            precioTemp = ingresaPrecio.nextFloat();

            System.out.println("Se registro el producto: " + nombreTemp + " con su valor de: " + precioTemp);
            precioActual = precioActual + precioTemp;
            System.out.println("El monto a pagar es de: " + precioActual + ". Quiere ingresar otro producto? (Y/N)");
            Scanner ingresaRespuesta = new Scanner(System.in);
            respuesta = ingresaRespuesta.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {
                insertarOtraCosa = false;
            }//drakul top
        }
        System.out.println("El monto total es de: " + precioActual);
    }
}