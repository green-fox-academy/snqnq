import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

        int sideCount;
        System.out.println("Adjon meg egy számot:");
        Scanner scanner = new Scanner(System.in);
        sideCount = scanner.nextInt();


        for (int i = 1; i <= sideCount; i++) {
            System.out.print("%");
        }
        System.out.println();

        for (int i = 2; i < sideCount; i++) {
            System.out.print("%");
            for (int n = 2; n < sideCount; n++) {
                System.out.print(" ");
            }
            System.out.print("%");
            System.out.println();
        }
        for (int i = 1; i <= sideCount; i++) {
            System.out.print("%");
        }
    }
}
