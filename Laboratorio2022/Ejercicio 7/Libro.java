public class Libro {
    private int id;
    private String nombre;
    private Integer precio;
    private String editorial;

    public Libro(int id, String nombre, int precio, String editorial) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer setNuevoPrecio(Libro librotemp, int descuento) {
        Integer preciotemp;
        preciotemp = librotemp.getPrecio();
        preciotemp = preciotemp-(preciotemp*descuento/100);
        return preciotemp;
    }
}
