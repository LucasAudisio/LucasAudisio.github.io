import java.util.ArrayList;

public class Madre extends  Persona{
    private String nombreEmpresa;
    private ArrayList<Hijo> hijos;

    public Madre(){
        super();
        this.nombreEmpresa = "";
        this.hijos = new ArrayList<>();
    }

    public Madre(String nombre, int edad, int dni, int telefono, String apellido, String nombreEmpresa, ArrayList<Hijo> hijos) {
        super(nombre, edad, dni, telefono, apellido);
        this.nombreEmpresa = nombreEmpresa;
        this.hijos = hijos;
    }

    public ArrayList<Hijo> hijosMenores(){
        ArrayList<Hijo> hijosMenores = new ArrayList<>();
        for(Hijo hijoActual:this.hijos){
            if (hijoActual.getEdad() < 18) {
                hijosMenores.add(hijoActual);
            }
        }
        return hijosMenores;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Hijo> hijos) {
        this.hijos = hijos;
    }
}