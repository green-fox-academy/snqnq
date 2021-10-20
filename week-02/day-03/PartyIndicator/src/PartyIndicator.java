import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        int girls, boys;

        Scanner scannerA = new Scanner(System.in);
        System.out.println("Hány lány jött el?");

        girls = scannerA.nextInt();

        Scanner scannerB = new Scanner(System.in);
        System.out.println("Hány fiú jött el?");

        boys = scannerA.nextInt();

        int total = girls + boys;


        if (girls <= 0) {
            System.out.println("Virsli party!");
        } else if (total > 20 && boys != girls) {
            System.out.println("Ez a buli egész jó!");
        } else if (total < 20) {
            System.out.println("Átlagos buli...");
        } else if (girls <= 0) {
            System.out.println("Virsli party!");
        } else if (total > 20 && boys == girls) {
            System.out.println("Ez a buli kitűnő!");};


            // Írj egy programot, ami két számot kér a standard input-ból
            // Az első szám a lányok száma, akik jönnek a buliba
            // A második szám a fiúk száma
            //
            // Ha több, mint 20 ember eljön és a lányok és fiúk száma egyenlő
            // Írja ki, hogy: Ez a buli kitűnő!
            //
            // Ha több, mint 20 ember eljön, de a lányok - fiúk arány nem egyenlő
            // Írja ki, hogy: Ez a buli egész jó!
            //
            // Ha kevesebb, mint 20 ember jön el
            // Írja ki, hogy: Átlagos buli...
            //
            // Ha egy lány sem jön el, függetlenül az emberek számától
            // Írja ki, hogy: Virsli party

    }
}