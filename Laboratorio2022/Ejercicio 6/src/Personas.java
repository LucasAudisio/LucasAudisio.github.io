public class Personas {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Personas(){
        this.nombre = "";
        this.edad = 0;
        this.dni = 0;
        this.telefono = 0;
        this.direccion = "";
    }

    public void setDatos(String nombre, int edad, int dni, int telefono, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
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

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setDni(int dni){
        this.dni = dni;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
}
