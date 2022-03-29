public class person {

    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public person(){
        this.nombre = "Alejo";
        this.edad = 17;
        this.dni = 46029600;
        this.telefono = 4152;
        this.direccion = "LaCalleDelColo123";
    }

    public person(String nombre){
        this.nombre = nombre;
        this.edad = 17;
        this.dni = 46029600;
        this.telefono = 4152;
        this.direccion = "LaCalleDelColo123";
    }

    public person(String nombre, int edad, int dni, int telefono, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
       this.direccion = direccion;
    }
    public String getName(){
        return this.nombre;
    }

    public boolean esMayor(){
        return this.edad>18;
    }
    public boolean sonLaMismaPersona(int dni){
        return this.dni == dni;
    }

    public int getDNI(){ return this.dni; }

    public boolean tienenMismaEdad(int edad){
        return this.edad == edad;
    }

    public int getEdad(){ return this.edad; }
}