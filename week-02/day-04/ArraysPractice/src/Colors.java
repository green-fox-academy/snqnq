import java.util.Arrays;

public class Colors {
    public static void main(String[] args) {

        String[][] colors = new String[3][4];
        String[] green  = new String[]{"lime", "forest green", "olive", "pale green", "spring green"};
        String[] red = new String[]{"orange red", "red", "tomato"};
        String[] pink = new String[]{"orchid", "violet", "pink", "hot pink"};

        colors[0] = green;
        colors[1] = red;
        colors[2] = pink;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < colors.length; j++) {
                System.out.println(colors[i][j] + "");
            }


        }
        System.out.println();
        System.out.println(Arrays.deepToString(colors));




 // - Készíts egy kétdimenziós tömböt
//   ami megadott színek különböző árnyalatait tartalmazza
// - A `colors[0]` a zöld árnyalatait tárolja:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - A `colors[1]` a piros árnyalatait:
//   `"orange red", "red", "tomato"`
// - A `colors[2]` pedig a pink árnyalatait:
//   `"orchid", "violet", "pink", "hot pink"`
    }

}
