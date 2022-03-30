public class Main {
    public static void main (String[] args) {
        Arrays Array = new Arrays();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(Array.cambiarPosiciones()[i][j]);
            }
        }
    }
}
