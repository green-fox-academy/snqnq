import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEven {

        public static void main(String[] args) {

            int i;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Adjon meg egy számot: ");

            i = scanner.nextInt();

            System.out.println(i % 2 == 0 ? "Páros" : "Páratlan");
            // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
            // majd kiírja, hogy "Páros", ha páros és
            // kiírja, hogy "Páratlan", ha páratlan.
        }
}

