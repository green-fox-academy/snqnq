import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {

        int number;

        System.out.println("Adjon meg egy számot:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + number + " = " + i * number);
        }

    }
}