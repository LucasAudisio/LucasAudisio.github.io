public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String apellido;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.dni = 0;
        this.telefono = 0;
        this.apellido = "";
    }

    public Persona(String nombre, int edad, int dni, int telefono, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.apellido = apellido;
    }

    public void setDatos(String nombre, int edad, int dni, int telefono, String apellido){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean esUnAdultoJoven(){
        return (this.edad >= 18 && this.edad <= 35);
    }
}
