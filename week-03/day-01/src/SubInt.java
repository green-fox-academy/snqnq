import java.util.Arrays;

public class SubInt{
    public static void main(String[] args) {

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

    public static int[] subInt(int a, int[] array) {
        int arrLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (matchNr(a, array[i])) {
                arrLength += 1;
            }
        }
        int[] myArr = new int[arrLength];
        int index = 0;
        for (int i = 0; i <array.length ; i++) {
            if(matchNr(a,array[i])){
                myArr[index] = i;
                index++;
            }
        }
        return myArr;
    }

    public static boolean matchNr(int i, int j){
        boolean result=false;
        while(j>=10){
            if(j%10==i){
                result=true;
            }
            j/=10;
        }
        if(i==j) result=true;
        return result;
    }
}
