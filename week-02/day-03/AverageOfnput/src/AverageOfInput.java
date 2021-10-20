import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {


        double a,b,c,d,e;

        Scanner scannerA = new Scanner(System.in);
        System.out.println("Első szám:");
        a = scannerA.nextDouble();
        Scanner scannerB = new Scanner(System.in);
        System.out.println("Második szám:");
        b = scannerB.nextDouble();
        Scanner scannerC = new Scanner(System.in);
        System.out.println("Harmadik szám:");
        c = scannerC.nextDouble();
        Scanner scannerD = new Scanner(System.in);
        System.out.println("Negyedik szám:");
        d = scannerD.nextDouble();
        Scanner scannerE = new Scanner(System.in);
        System.out.println("Ötödik szám:");
        e = scannerE.nextDouble();

        double sum = a + b + c + d + e;
        double Avg = (a + b + c + d + e) / 5;

        System.out.println("Összeg: " + sum );
        System.out.println("Átlag: " + Avg );

        // Írj egy programot, ami 5 egész számot kér be egymás után,
        // majd kiírja a számok összegét és átlagát a következő formátumban:
        //
        // Összeg: 22, Átlag: 4.4
    }
}
