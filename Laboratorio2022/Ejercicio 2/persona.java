import java.util.Scanner;

public class persona {

        private String nombre;
        private int edad;
        private int dni;
        private int telefono;
        private String direccion;

        public persona(){

            Scanner IngresoNombre = new Scanner(System.in);
            this.nombre = IngresoNombre.nextLine();

            Scanner IngresoEdad = new Scanner(System.in);
            this.edad = IngresoEdad.nextInt();

            Scanner IngresoDni = new Scanner(System.in);
            this.dni = IngresoDni.nextInt();

            Scanner IngresoTelefono = new Scanner(System.in);
            this.telefono = IngresoTelefono.nextInt();

            Scanner IngresoDireccion = new Scanner(System.in);
            this.direccion = IngresoDireccion.nextLine();
        }

        public String getNombre(){
            return this.nombre;
        }

        public int getEdad(){
            return this.edad;
        }

        public int getDni(){
            return this.dni;
        }

        public int getTelefono(){
            return this.telefono;
        }

        public String getDireccion(){
            return this.direccion;
        }

        //Setters

        public String setNombre(String nombre){
            this.nombre = nombre;
            return "qsy";
        }

        public int setEdad(int edad){
            this.edad = edad;
            return 0;
        }

        public int setDni(int dni){
            this.dni = dni;
            return 0;
        }

        public int setTelefono(int telefono){
            this.telefono = telefono;
            return 0;
        }

        public String setDireccion(String direccion){
            this.direccion = direccion;
            return "a";
        }
}
