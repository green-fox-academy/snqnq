public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        System.out.println(quote.substring(0, 20) + " always takes longer than " + quote.substring(21));

    }

        // Az idézet mentésekor lemezhiba történt. Kérlek, javítsd ki.
        // Add hozzá az "always takes longer than"-t a StringBuilder (quote) -hoz
        // az "It" és a "you" szó közzé.
        // Használd a quote változó darabjait(a String újra definiálása helyett).

}