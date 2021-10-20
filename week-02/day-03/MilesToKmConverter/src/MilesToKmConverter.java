import java.util.Scanner;

public class MilesToKmConverter {
    public static void main(String[] args) {

        double miles, km;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a mérföldet:");

        miles = scanner.nextDouble();
        System.out.println(miles / 0.62137 + " km");
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben
    }
}
