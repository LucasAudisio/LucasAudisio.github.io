import java.util.ArrayList;

public class Cantante extends Persona{
    private String nombreArtistico;
    private ArrayList<Cancion> canciones;

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public Cantante() {
        super();
        this.nombreArtistico = "";
        this.canciones = new ArrayList<>();
    }

    public Cantante(String nombre, int edad, int dni, int telefono, String apellido, String nombreArtistico, ArrayList<Cancion> canciones) {
        super(nombre, edad, dni, telefono, apellido);
        this.nombreArtistico = nombreArtistico;
        this.canciones = canciones;
    }

    public ArrayList<Cancion> obtenerCancionesMasLargas(){
        ArrayList<Cancion> cancionesMasLargas = new ArrayList<>();
        for(Cancion cancionActual: this.canciones){
            if(cancionActual.esUnaCancionLarga()) {
                cancionesMasLargas.add(cancionActual);
            }
        }
        return cancionesMasLargas;
    }

    public void agregarCanción(String nombre, int duracionEnSegundos){
        Cancion cancionAAñadir = new Cancion(nombre, duracionEnSegundos);
        this.canciones.add(cancionAAñadir);
    }
}
