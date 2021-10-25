public class Greet {

    public static void main(String[] args) {
        String name = new String("Green Fox");
            System.out.println(greet(name));
        };


    public static String greet(String name) {

            String greeting = "Üdv, kedves " + name;
            return greeting;
    }



    // - Hozz létre egy class-t `Greet` névvel és benne a main függvényt.

// - Hozz létre egy `name` nevű String változót, aminek az értéke legyen `Green Fox`.

// - Készíts egy függvényt `greet` névvel mely üdvözli a bemeneti paraméterét kiírással(void & print)
//   pl.: `Üdv, kedves Green Fox`

// - greet(`name`)
}
