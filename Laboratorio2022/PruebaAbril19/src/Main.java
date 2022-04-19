public class Main {
    public static void main(String[] args) {
        Cantante cantanteEj5 = new Cantante();
        System.out.println("Nombre: " + cantanteEj5.getNombre());
        cantanteEj5.setNombre("Lucas");
        System.out.println("Nombre: " + cantanteEj5.getNombre());
    }
}