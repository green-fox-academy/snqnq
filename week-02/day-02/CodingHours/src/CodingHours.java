public class CodingHours {

    public static void main(String[] args) {

        int hours = 6;
        int term = 17;
        int week = 5;
        int avgHours = 52;

        int total = hours * week * term;
        double maxHours = avgHours * term;
        double percent = total / maxHours;
        double finalPercent = percent * 100;


        System.out.println(total);
        System.out.println(finalPercent + "%");






        // Egy átlagos Green Fox hallgató 6 órát kódol naponta
        // Egy félév hosszúsága 17 hét
        //
        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        // ha a hallgató csak hétköznap kódol
        //
        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        // ha az átlagos heti munkaidő 52 óra
    }
}
