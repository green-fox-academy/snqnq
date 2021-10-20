import java.util.Scanner;

public class OneTwoAlot {
    public static void main(String[] args) {

        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy számot: ");

        i = scanner.nextInt();

        if(i <= 0){
            System.out.println("Nem elég.");
        }else if(i == 1){
            System.out.println("Egy");
        }else if(i == 2){
            System.out.println("Kettő");
        }else if (2 < i) {
            System.out.println("Sok");
        };




        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // Ha a szám kisebb vagy egyenlő 0-val, írja ki, hogy: "Nem elég"
        // Ha a szám egyenlő 1-gyel, írja ki, hogy: "Egy"
        // Ha a szám egyenlő 2-vel, írja ki, hogy: "Kettő"
        // Ha a szám nagyobb, mint 2, írja ki, hogy: "Sok"
    }
}
