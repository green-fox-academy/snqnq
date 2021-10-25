import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner inputA = new Scanner(System.in);

        System.out.println("Adjon meg számokat:");
        System.out.print("Első: ");
        int num1 = inputA.nextInt();
        System.out.print("Második: ");
        int num2 = inputA.nextInt();
        System.out.print("Harnadik: ");
        int num3 = inputA.nextInt();

        System.out.println(sum(num1, num2, num3));


    }

    private static int sum(int num1, int num2, int num3) {
        return  num1 + num2 + num3;
    }
}


// - Hozz létre egy class-t `Sum` névvel és benne a main függvényt.

// - Készíts egy függvényt `sum` névvel mely összeadja a számokat
//   nullától a bemeneti paraméterig és visszaadja azok összegét.