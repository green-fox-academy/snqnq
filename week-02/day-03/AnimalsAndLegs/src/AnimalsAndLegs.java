import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        int chicken, pig;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány tyúk van?");

        chicken = scanner.nextInt();

        Scanner Newscanner = new Scanner(System.in);
        System.out.println("Hány malac van?");

        pig = Newscanner.nextInt();

        System.out.println("Összesen " + (chicken*2 + pig*4) + " lába van az állatoknak." );




        // Írj egy programot, ami két egész számot kér
        // Az első a farmer tyúkjainak számát reprezentálja
        // A második a farmer sertéseinek számát reprezentálja
        // Írja ki, hogy összesen hány darab lába van az állatoknak a farmon
    }
}
