import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {


        int a = 1;
        int[] b = {1, 11, 34, 52, 61};

        System.out.println(subInt(a, b));


        // - Készíts egy függvényt ami bemeneti paraméterként egy számot és egy integer array-t vár.

        // - Visszaadja a bemeneti tömb azon indexeit, ahol a tömb értékei tartalmazzák az első bemeneti értéket.
        // - Vagy egy üres array-t ad vissza, amennyiben az első bemeneti értéket a lista sehol sem tartalmazza.

        //  Példa:
        System.out.println(Arrays.toString(subInt(1, new int[]{1, 11, 34, 52, 61})));
        //  Eredmény kiíratva: `[0, 1, 4]`
        System.out.println(Arrays.toString(subInt(9, new int[]{1, 11, 34, 52, 61})));
        //  Eredmény kiíratva: '[]'

        // Megjegyzés: Az array kiirattatására használhatjuk az Arrays.toString() függvényt.
        // Vagy használhatjuk a végigiterálást is.
    }

    public static int[] subInt(int a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (a == b[i]) {
                System.out.println(b[i]);
            } else {
        final int[] ints = new int[]{};
        return ints;

            }
        }
        return b;
    }
}