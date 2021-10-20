public class secondsInAday {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int totalSecondsAday = 24 * 60 * 60;
        int pastSeconds = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;
        System.out.println(totalSecondsAday - pastSeconds + "seconds left.");
        // Írj egy programot, ami kiszámítja, hogy hány másodperc
        // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
        // lehet beállítani (a végeredmény is legyen egész szám)
    }
}