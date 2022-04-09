import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Pedido{
    private Plato platoPedido;
    private Alumno alumnoPidio;
    private LocalDateTime fechaHoraCreacion;
    private boolean seEntrego;

    public Pedido(){
        this.platoPedido = new Plato();
        this.alumnoPidio = new Alumno();
        this.fechaHoraCreacion = LocalDateTime.now();
        this.seEntrego = false;
    }

    public Pedido(Plato platoPedido, Alumno alumnoPidio, LocalDateTime fechaHoraCreacion, boolean seEntrego) {
        this.platoPedido = platoPedido;
        this.alumnoPidio = alumnoPidio;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.seEntrego = seEntrego;
    }

    public Plato getPlatoPedido() {
        return platoPedido;
    }

    public void setPlatoPedido(Plato platoPedido) {
        this.platoPedido = platoPedido;
    }

    public Alumno getAlumnoPidio() {
        return alumnoPidio;
    }

    public void setAlumnoPidio(Alumno alumnoPidio) {
        this.alumnoPidio = alumnoPidio;
    }

    public LocalDateTime getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(LocalDateTime fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public boolean isSeEntrego() {
        return seEntrego;
    }

    public void setSeEntrego(boolean seEntrego) {
        this.seEntrego = seEntrego;
    }
}
