/*1) Crear una aplicación que pida al usuario ingresar los datos necesarios para crear un objeto de la clase Persona.
2) Crear la instancia de la clase Persona e imprimir cuáles fueron los datos ingresados utilizando "getters".
3) Ofrecerle al usuario la opción de cambiar uno de sus datos (el usuario deberá elegir), realizar el cambio utilizando
"setters" e imprimir nuevamente los datos del objeto creado.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        persona p1 = new persona();
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("edad: " + p1.getEdad());
        System.out.println("dni: " + p1.getDni());
        System.out.println("telefono: " + p1.getTelefono());
        System.out.println("direccion: " + p1.getDireccion());

        System.out.println("quiere cambiar algun data? Y/N");
        Scanner IngresoCambio = new Scanner(System.in);
        String Cambio = IngresoCambio.nextLine();

        if(Cambio.equals("y") || Cambio.equals("Y")){
            System.out.println("Ingrese un valor: \n 1.Nombre \n 2.Edad \n 3.dni \n 4.telefono \n 5.direccion");
            Scanner Ingresovalor = new Scanner(System.in);
            int valor = Ingresovalor.nextInt();

            Scanner ingresoDato = new Scanner(System.in);

            if(valor == 1){
                String nombre = ingresoDato.nextLine();
                p1.setNombre(nombre);
            }
            else if(valor == 2){
                int edad = ingresoDato.nextInt();
                p1.setEdad(edad);
            }
            else if(valor == 3){
                int dni = ingresoDato.nextInt();
                p1.setDni(dni);
            }
            else if(valor == 4){
                int telefono = ingresoDato.nextInt();
                p1.setTelefono(telefono);
            }
            else if(valor == 5){
                String direccion = ingresoDato.nextLine();
                p1.setDireccion(direccion);
            }
        }

        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("edad: " + p1.getEdad());
        System.out.println("dni: " + p1.getDni());
        System.out.println("telefono: " + p1.getTelefono());
        System.out.println("direccion: " + p1.getDireccion());
    }
}