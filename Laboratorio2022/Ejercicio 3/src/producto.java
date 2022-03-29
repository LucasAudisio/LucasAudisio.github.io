import java.util.Scanner;

public class producto {
    private String nombre;
    private float precio;

    public producto(){
        this.nombre="ejemplo";
        this.precio=0;
    }

    public void setNombre (String nombre) {
        this.nombre=nombre;
    }

    public void setPrecio(float precio) {
        this.precio=precio;
    }

    public String getNombre () {
        return this.nombre;

    }

    public float getPrecio () {
        return this.precio;
    }
}