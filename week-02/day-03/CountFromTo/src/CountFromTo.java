import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

  int a,b;

        Scanner scannerA = new Scanner(System.in);
        System.out.println("Adjon meg egy számot:");
        a = scannerA.nextInt();

        Scanner scannerB = new Scanner(System.in);
        System.out.println("Adjon meg egy másik számot:");
        b = scannerB.nextInt();

        if(a > b){
            System.out.println("A második számnak nagyobbnak kell lennie");
        } else if(a < b){
            for ( int i = a ;i < b ; i++){
                System.out.println(i);
            };
        }





// Készíts egy programot, ami két számot kér
// Ha a második szám nem nagyobb, mint az első, írja ki:
// "A második számnak nagyobbnak kellene lennie!"
//
// Amennyiben nagyobb,
// az első számtól kezdve el kellene számolnia egyesével a másodikig
//
// Például:
//
// első szám: 3, második szám: 6, ezt kellene printelnie:
//
// 3
// 4
// 5

    }
}
