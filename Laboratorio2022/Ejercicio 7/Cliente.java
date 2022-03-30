import java.util.ArrayList;
public class Cliente {
    private int id;
    private String nombre;
    private int edad;
    private ArrayList<Libro> librosComprados;

    public Cliente(int id2, String nombre2, int edad2, ArrayList<Libro> librosComprados2) {
        this.id = id2;
        nombre = nombre2;
        edad = edad2;
        librosComprados = librosComprados2;
    }

    public void setLibrosComprados(ArrayList<Libro> librosComprados) {
        librosComprados = librosComprados;
    }

    public void setEdad(int edad) {
        edad = edad;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public void setId(int id) {
        id = id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Libro> getLibrosComprados() {
        return librosComprados;
    }

    public int getEdad() {
        return edad;
    }
}