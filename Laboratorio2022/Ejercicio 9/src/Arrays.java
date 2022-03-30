

public class Arrays {
    private int[][] array = {{4,7,1,3,5}, {2,0,6,9,7}, {3,1,2,6,4}};
    private int[][] array2 = {{4,7,-5,4,9}, {2,0,6,9,7}, {3,1,2,6,4}, {0,0,0,0,0}};
    private int[][] arrayInvertido = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};


    public int[][] cambiarPosiciones() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                arrayInvertido[j][i] = array[i][j];
                System.out.println(arrayInvertido[j][i]);
            }
        }
        return arrayInvertido;
    }

    public int[][] getArrayInvertido() {
        return arrayInvertido;
    }
}
