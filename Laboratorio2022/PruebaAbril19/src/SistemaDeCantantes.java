import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.ArrayList;

public class SistemaDeCantantes {
    private ArrayList<Cantante> cantantes;

    public SistemaDeCantantes(){
        this.cantantes = new ArrayList<>();
    }

    public ArrayList<Cantante> obtenerCantantesJovenes(){
        ArrayList<Cantante> cantantesJovenes = new ArrayList<>();

        for(Cantante cantanteActual : this.cantantes){
            if(cantanteActual.getEdad() >= 18 && cantanteActual.getEdad() <= 35)
                cantantesJovenes.add(cantanteActual);
        }

        return cantantesJovenes;
    }

    public void agregarCancion(String nombreArtistico, String nombreCancion, int duracionEnSegundos){
        boolean seEncuentra = false;
        for (Cantante cantanteActual : this.cantantes){
            if(cantanteActual.getNombre() == nombreArtistico){
                cantanteActual.agregarCanción(nombreCancion, duracionEnSegundos);
                seEncuentra = true;
            }
        }

        if (!seEncuentra) System.out.println("No se encuentra en el sistema");
    }
}
