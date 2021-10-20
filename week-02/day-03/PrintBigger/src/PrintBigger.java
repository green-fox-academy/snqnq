import java.util.Scanner;

public class PrintBigger {
        public static void main(String[] args) {

            Scanner scannerA = new Scanner(System.in);
            System.out.println("Adja meg az első számot:");
            int a = scannerA.nextInt();

            Scanner scannerB = new Scanner(System.in);
            System.out.println("Adja meg az második számot:");
            int b = scannerB.nextInt();


            if(a > b){
                System.out.println(a);
            }else{
                System.out.println(b);
            };


            // Írj egy programot, ami két számot kér a standard input-ból
            // és kiírja a nagyobbat
        }
}

