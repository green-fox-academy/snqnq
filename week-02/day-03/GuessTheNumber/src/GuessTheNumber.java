import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int n = 22;
        int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Találja ki a számot. Írja be a megoldást:");
        guess = scanner.nextInt();
        if (guess == n) {
            System.out.println("Eltaláltad!");
        } else {
            while (guess != n) {
                if (guess < n) {
                    System.out.println("A szám nagyobb!");
                } else {
                    System.out.println("A szám kisebb!");
                }
                System.out.println("Probálkozzon újra!");
                guess = scanner.nextInt();
            }
            System.out.println("Ez az!");
        }
    }
}
