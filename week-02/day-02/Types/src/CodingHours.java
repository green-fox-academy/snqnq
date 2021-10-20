package Types;

public class CodingHours {
    public static void main (String [] args){
        // Egy átlagos Green Fox hallgató 6 órát kódol naponta
        // Egy félév hosszúsága 17 hét
        //
        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        // ha a hallgató csak hétköznap kódol
        int hoursPerDay=6;
        int daysPerWeek=5;
        int weeksPerSemester=17;
        System.out.println("Hours a student spends on coding in a semester: " +
                hoursPerDay*daysPerWeek*weeksPerSemester);
        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        // ha az átlagos heti munkaidő 52 óra
        double workingHoursPerWeek=52.0;
        double percentageOnCoding=hoursPerDay*daysPerWeek/workingHoursPerWeek*100;
        System.out.print("A student spends ");
        System.out.printf("%.2f",percentageOnCoding);
        System.out.print("% of their time with coding");
        System.out.println("\n");
    }
}