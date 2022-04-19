public class Cancion {
    private String nombre;
    private int duracionEnSegundos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionEnSegundos() {
        return duracionEnSegundos;
    }

    public void setDuracionEnSegundos(int duracionEnSegundos) {
        this.duracionEnSegundos = duracionEnSegundos;
    }

    public Cancion(){
        this.nombre = "";
        this.duracionEnSegundos = 0;
    }

    public Cancion(String nombre, int duracionEnSegundos) {
        this.nombre = nombre;
        this.duracionEnSegundos = duracionEnSegundos;
    }

    public boolean esUnaCancionLarga(){
        return this.duracionEnSegundos >= 240;
    }
}
