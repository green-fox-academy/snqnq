import java.util.Arrays;

public class Bubble {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] advancedBubble(int arr[]){
        boolean swapped = true;
        for (int i = 0; i < arr.length && swapped; i++) {
            swapped = false;
            System.out.println("number of iteration" + i);

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
        }


        return arr;
    }


    public static void main(String[] args) {
        int arr[] =new int[]{34, 12, 24, 9, 5};


        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        advancedBubble(arr);

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
        // - Készíts egy függvényt `buddle` névvel ami bemeneti paraméterként egy integer listát vár.
        // - A fügvény egy listát adjon vissza ahol a lista elemei növekvő sorrendbe vannak rendezve.

        // - Készíts egy második függvényt `advancedBubble` névvel ami két paramétert vár, egy integer listát
        //   és egy booleant.
        // - A fügvény egy listát adjon vissza, ahol a lista elemei növekvő sorrendbe vannak rendezve,
        //   ha a boolean false. Ha pedig true, akkor a listát csökkenő sorrendbe rendezve adja vissza.

        //  Példa:
       // System.out.println(bubbleSort(new int[]{34}, 12, 24, 9, 5));
        //  Eredmény kiíratva: [5, 9, 12, 24, 34]
        // System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));

}


