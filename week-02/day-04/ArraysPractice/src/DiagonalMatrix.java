import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {

        int x = 4;
        int y = 4;
        int[][] arr = new int[x][y];

        for (int i = 0; i < x ; i++) {
            for (int j = 0; j < y; j++) {
                if(i == j){
                   arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



            // - Készíts (dinamikusan*) egy kétdimenziós tömböt
//   a következő mátrix-szal**. Ciklust (loop-ot) használj!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Írasd ki a konzolra ezt a kétdimenziós tömböt
// * A tömb hossza egy változótól kell függjön
// ** Nyugalom, egy mátrix pont olyan, mint egy tömb
    }
}
