public class Main {

    public static void main(String[] args) {
        String nombre = "a";
        int edad = 2;
        int dni = 12345678;
        int telefono = 11223344;
        String direccion = "callefalsa123";

        person p1 = new person(nombre, edad*2, dni, telefono, direccion);
        person p2 = new person(nombre, edad, dni, 11554466, direccion);
        person p3 = new person(nombre, edad, dni, telefono, direccion);

        System.out.println(p1.esMayor());
        System.out.println(p1.sonLaMismaPersona(p2.getDNI()));
        System.out.println(p1.tienenMismaEdad(p2.getEdad()));
    }
}