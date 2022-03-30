import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void Main(String[] args){
        //Editoriales: Kapelusz, Sudamericana, Atlántida, ElAteneo, Interzona, Sur y Alianza.

        //Inicializar Libros
        Libro libro1  = new Libro(1 , "kibro1 ", 6000, "Kapelusz");
        Libro libro2  = new Libro(2 , "libro2 ", 1500, "Kapelusz");
        Libro libro3  = new Libro(3 , "libro3 ", 8000, "Kapelusz");
        Libro libro4  = new Libro(4 , "libro4 ", 6549, "Sudamericana");
        Libro libro5  = new Libro(5 , "libro5 ", 1100, "Sudamericana");
        Libro libro6  = new Libro(6 , "libro6 ", 1100, "Atlántida");
        Libro libro7  = new Libro(7 , "libro7 ", 1100, "Atlántida");
        Libro libro8  = new Libro(8 , "libro8 ", 1100, "ElAteneo");
        Libro libro9  = new Libro(9 , "libro9 ", 1100, "ElAteneo");
        Libro libro10 = new Libro(10, "libro10", 1100, "Interzona");
        Libro libro11 = new Libro(11, "libro11", 1100, "Interzona");
        Libro libro12 = new Libro(12, "libro12", 1100, "Sur");
        Libro libro13 = new Libro(13, "libro13", 1100, "Sur");
        Libro libro14 = new Libro(14, "libro14", 1100, "Alianza");
        Libro libro15 = new Libro(15, "libro15", 1100, "Alianza");
        ArrayList<Libro> todosLodLibros = new ArrayList<>();
        todosLodLibros.add(libro1);
        todosLodLibros.add(libro2);
        todosLodLibros.add(libro3);
        todosLodLibros.add(libro4);
        todosLodLibros.add(libro5);
        todosLodLibros.add(libro6);
        todosLodLibros.add(libro7);
        todosLodLibros.add(libro8);
        todosLodLibros.add(libro9);
        todosLodLibros.add(libro10);
        todosLodLibros.add(libro11);
        todosLodLibros.add(libro12);
        todosLodLibros.add(libro13);
        todosLodLibros.add(libro14);
        todosLodLibros.add(libro15);

        //Inicializar cliente alejo
        ArrayList<Libro> AlejoCompras = new ArrayList<>();
        AlejoCompras.add(libro1);
        AlejoCompras.add(libro2);
        AlejoCompras.add(libro3);
        AlejoCompras.add(libro4);
        AlejoCompras.add(libro5);
        AlejoCompras.add(libro6);
        AlejoCompras.add(libro7);
        AlejoCompras.add(libro8);
        AlejoCompras.add(libro9);
        Cliente Alejo = new Cliente(1, "Alejo", 17, AlejoCompras);

        //Inicializar cliente Dito
        ArrayList<Libro> DitoCompras = new ArrayList<>();
        DitoCompras.add(libro4);
        DitoCompras.add(libro5);
        DitoCompras.add(libro6);
        DitoCompras.add(libro7);
        DitoCompras.add(libro8);
        DitoCompras.add(libro9);
        DitoCompras.add(libro10);
        DitoCompras.add(libro11);
        DitoCompras.add(libro12);
        DitoCompras.add(libro13);
        DitoCompras.add(libro14);
        Cliente Dito = new Cliente(2, "Dito", 18, DitoCompras);

        //Inicializar cliente Audi
        ArrayList<Libro> AudiCompras = new ArrayList<>();
        AudiCompras.add(libro1);
        AudiCompras.add(libro2);
        AudiCompras.add(libro3);
        AudiCompras.add(libro4);
        AudiCompras.add(libro5);
        AudiCompras.add(libro6);
        AudiCompras.add(libro7);
        AudiCompras.add(libro8);
        AudiCompras.add(libro9);
        AudiCompras.add(libro10);
        AudiCompras.add(libro11);
        AudiCompras.add(libro12);
        AudiCompras.add(libro13);
        AudiCompras.add(libro14);
        AudiCompras.add(libro15);
        Cliente Audi = new Cliente(3, "Audi", 17, AudiCompras);

        //Inicializar Sistema
        ArrayList<Cliente> Clientes = new ArrayList<>();
        Clientes.add(Audi);
        Clientes.add(Dito);
        Clientes.add(Alejo);

        ArrayList<Libro> LibrosEnVenta = new ArrayList<>();
        LibrosEnVenta.add(libro1);
        LibrosEnVenta.add(libro2);
        LibrosEnVenta.add(libro3);
        LibrosEnVenta.add(libro4);
        LibrosEnVenta.add(libro5);
        LibrosEnVenta.add(libro6);
        LibrosEnVenta.add(libro7);
        LibrosEnVenta.add(libro8);
        LibrosEnVenta.add(libro9);
        LibrosEnVenta.add(libro10);
        LibrosEnVenta.add(libro12);
        LibrosEnVenta.add(libro13);

        ArrayList<Integer> LibrosEnOferta = new ArrayList<>();
        LibrosEnOferta.add(8);
        LibrosEnOferta.add(9);
        LibrosEnOferta.add(10);
        LibrosEnOferta.add(11);
        LibrosEnOferta.add(12);
        LibrosEnOferta.add(13);
        LibrosEnOferta.add(14);
        LibrosEnOferta.add(15);


        SistemaLibreria Sistema = new SistemaLibreria(Clientes, LibrosEnVenta, LibrosEnOferta, "Sistema");

        ArrayList<Libro> todosLosVendidos = new ArrayList<>();

        for (int i=0; i< AlejoCompras.size(); i++) {
            todosLosVendidos.add(AlejoCompras.get(i));
        }
        for (int i=0; i< DitoCompras.size(); i++) {
            todosLosVendidos.add(DitoCompras.get(i));
        }
        for (int i=0; i< AudiCompras.size(); i++) {
            todosLosVendidos.add(AudiCompras.get(i));
        }

        for(Cliente clienteAct : Clientes){
            System.out.println(clienteAct.getId());
            System.out.println(clienteAct.getEdad());
            System.out.println(clienteAct.getNombre());
            System.out.println(clienteAct.getLibrosComprados() + "\n ----------------------------");
        }

        //ej 1:
        System.out.println(Sistema.ClientesFrecuentes());

        //ej 2:
        System.out.println(Sistema.LibrosMuyVendidos(todosLodLibros));

        //ej 3:
        System.out.println(Sistema.EdadesFrecuentes(Sistema.ClientesFrecuentes()));

        //ej 4:
        System.out.println(Sistema.LibrosCaros(Sistema.getLibrosEnVenta()));

        //ej 5:
        todosLosVendidos.add(Sistema.NuevoLibroVendido());

        //ej 6:
        System.out.println(Sistema.LibroConCiertaLetra(todosLodLibros));

        //ej 7:
        System.out.println(Sistema.MontosTotales(Clientes));

        ej 8:
        System.out.println("Ingrese el descuento a poner a un libro");
        Scanner IngresoDTO = new Scanner(System.in);
        Integer descuento = IngresoDTO.nextLine();
        Sistema.cambiarPrecio(descuento);


        //ej 9:
        //Sistema.cambiarPreciosNavidad(LibrosEnVenta);
    }

}
