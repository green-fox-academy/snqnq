public class Factorio {

    public static void main(String[] args) {
                System.out.print("A szam faktorai: ");
        Factorio(25);

    }


    public static void Factorio(int a) {
        for (int i = 1; i <= a; i++) {
            if(a % i == 0)  {
                System.out.print(" " + i + " ");

            }


        }

    }
}

