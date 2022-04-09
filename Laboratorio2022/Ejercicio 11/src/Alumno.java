public class Alumno extends Persona{
    private String curso;
    private int nroLegajo;
    private String orientcion;

    public Alumno(){
        super();
        this.curso = "";
        this.nroLegajo = 0;
        this.orientcion = "";
    }

    public Alumno(String nombre, int edad, int dni, int telefono, String apellido, String curso, int nroLegajo, String orientcion) {
        super(nombre, edad, dni, telefono, apellido);
        this.curso = curso;
        this.nroLegajo = nroLegajo;
        this.orientcion = orientcion;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getOrientcion() {
        return orientcion;
    }

    public void setOrientcion(String orientcion) {
        this.orientcion = orientcion;
    }
}
