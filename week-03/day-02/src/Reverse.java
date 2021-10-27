import static jdk.nashorn.internal.objects.NativeArray.$clinit$;
import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Reverse {

    public static void main(String... args) {
        String forditando = "reteP hgolaB";
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(reverse(forditando));
        /*char letter;
        String reversed = "";
        for (int i = 0; i < toBeReversed.length(); i++){
            letter = toBeReversed.charAt(i);
            reversed = letter + reversed;*/


        // Készíts egy függvényt ami megfordít egy Stringet, amit
        // bemeneti paraméterként kap.
        // Használd a függvényt a "toBeReversed" változón ellenőrzésként.
        // Elsőként próbáld megoldani a feladatot a charAt() függvénnyel, majd
        // opcionálisan akárhogy.


    }

    public static String reverse(String sentence) {
            String reversed = "";
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            reversed = letter + reversed;
        }
            return reversed;
    }

}
