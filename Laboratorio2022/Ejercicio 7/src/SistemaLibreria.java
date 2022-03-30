

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaLibreria {
    private ArrayList<Cliente> clientes;
    private ArrayList<Libro> librosEnVenta;
    private ArrayList<Integer> librosEnOferta;
    private ArrayList<Libro> librosVendidos;
    private String nombre;

    public SistemaLibreria(ArrayList<Cliente> clientes2, ArrayList<Libro> librosEnVenta2, ArrayList<Integer> librosEnOferta2, String nombre2) {
        this.clientes = clientes2;
        this.librosEnVenta = librosEnVenta2;
        this.librosEnOferta = librosEnOferta2;
        this.nombre = nombre2;
    }

    public ArrayList<String> LibrosMuyVendidos(ArrayList<Libro> todosLosLibros){
        ArrayList<String> LibrosMuyVendidos = new ArrayList<>();
        ArrayList<Integer> LibrosVendidazos = new ArrayList<>();

        for(int i = 0; i < 15; i++){
            LibrosVendidazos.add(0);
        }

        for(Cliente clienteActual : clientes){
            for (int i = 0; i < clienteActual.getLibrosComprados().size(); i++){
                int temp = LibrosVendidazos.get(clienteActual.getLibrosComprados().get(i).getId() - 1);
                LibrosVendidazos.set(clienteActual.getLibrosComprados().get(i).getId() - 1, temp + 1);
                System.out.println(i + ": " + LibrosVendidazos.get(clienteActual.getLibrosComprados().get(i).getId() - 1));
            }
            //culebra
        }
        for(int i = 0; i < LibrosVendidazos.size(); i++){
            if(LibrosVendidazos.get(i) > 2) LibrosMuyVendidos.add(todosLosLibros.get(i - 1).getNombre());
        }
        System.out.println(LibrosVendidazos);
        return LibrosMuyVendidos;
    }



    public ArrayList<Cliente> ClientesFrecuentes(){
        ArrayList<Cliente> ClientesFrecuentes = new ArrayList<>();

        for(Integer i = 0; i < this.clientes.size(); i++){
            if(this.clientes.get(i).getLibrosComprados().size() > 10)
                ClientesFrecuentes.add(this.clientes.get(i));
        }

        return ClientesFrecuentes;
    }

    public ArrayList<Integer> EdadesFrecuentes (ArrayList<Cliente>ClientesFrecuentes) {
        ArrayList<Integer> EdadesFrecuentes = new ArrayList<>();
        for (Integer i = 0; i < ClientesFrecuentes.size(); i++) {
            EdadesFrecuentes.add(ClientesFrecuentes.get(i).getEdad());
        }
        return EdadesFrecuentes;
    }

    public ArrayList<Libro> LibrosCaros (ArrayList<Libro>librosEnVenta) {
        ArrayList<Libro> librosCaros = new ArrayList<>();
        for (int i=0; i<librosEnVenta.size(); i++) {
            if (librosEnVenta.get(i).getPrecio()>5500)
                librosCaros.add(librosEnVenta.get(i));
        }
        return librosCaros;
    }

    public Libro NuevoLibroVendido(){
        Libro nuevoLibro = new Libro(1, "libro1 ", 6000, "Kapelusz");
        return nuevoLibro;
    }

    public ArrayList<Libro> LibroConCiertaLetra (ArrayList<Libro>todosLosLibros) {
        ArrayList<Libro> librosConCaracterEquis = new ArrayList<>();
        char caracterAComparar;
        System.out.println("Ingrese un caracter");
        Scanner IngresoLetra = new Scanner(System.in);
        String texto = IngresoLetra.nextLine();
        caracterAComparar=texto.charAt(0);
        for (int i=0; i<todosLosLibros.size(); i++) {
            if (todosLosLibros.get(i).getNombre().charAt(0)==caracterAComparar) {
                librosConCaracterEquis.add(todosLosLibros.get(i));
            }
        }
        return librosConCaracterEquis;
    }

    public ArrayList<Integer> MontosTotales(ArrayList<Cliente> Clientes) {
        ArrayList<Integer> Montos = new ArrayList<>();
        for (int i=0; i<3; i++) {Montos.add(0);}
        for (int i=0; i<Clientes.size(); i++) {
            for (int j=0; j<Clientes.get(i).getLibrosComprados().size(); j++) {
                Montos.set(i, Montos.get(i)+Clientes.get(i).getLibrosComprados().get(j).getPrecio());
                System.out.println(Montos.get(i));
            }
        }
        return Montos;
    }


    public void cambiarPrecio(Integer descuento) {
        int temp;
        Libro librotemp;
        System.out.println("A que numero de libro quiere modificarle el precio?");
        Scanner IngresoID = new Scanner(System.in);
        Integer IDaCambiar = IngresoID.nextInt();
        librotemp=this.librosEnVenta.get(IDaCambiar);
        librotemp.setPrecio(librotemp.getPrecio()-librotemp.getPrecio()*descuento/100);
        librosEnVenta.set(IDaCambiar-1, librotemp);
        System.out.println(librosEnVenta.get(IDaCambiar-1).getPrecio());
    }




    public ArrayList<Libro> cambiarPrecioNavidad (ArrayList<Libro> ListaLibros) {
        Libro librotemp;
        int dto=0;
        for (int i=1; i<=librosEnVenta.size(); i++) {
            dto=35;
            if (i%2 == 0) {
                dto=25;
            }
            librotemp=librosEnVenta.get(i-1);
            librotemp.setPrecio(librotemp.getPrecio()-librotemp.getPrecio()*dto/100);
            librosEnVenta.set(i, librotemp);
        }
        return librosEnVenta;
    }

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public ArrayList<Integer> getLibrosEnOferta() {
        return librosEnOferta;
    }

    public void setLibrosEnOferta(ArrayList<Integer> librosEnOferta) {
        librosEnOferta = librosEnOferta;
    }

    public ArrayList<Libro> getLibrosEnVenta() {
        return librosEnVenta;
    }

    public void setLibrosEnVenta(ArrayList<Libro> librosEnVenta) {
        librosEnVenta = librosEnVenta;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        clientes = clientes;
    }
}
