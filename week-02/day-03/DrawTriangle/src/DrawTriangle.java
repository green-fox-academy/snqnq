import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        int lineCount;
        System.out.println("Adjon meg egy számot");
        Scanner scanner = new Scanner(System.in);
        lineCount = scanner.nextInt();
        for (int i = 1; i <= lineCount; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}