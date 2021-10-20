import java.sql.SQLOutput;

public class Cuboid {
    public static void main(String[] args) {

        double a = 12.5;
        double b = 5.2;
        double c = 9.4;

        double SurfaceArea = 2 * (a * b + a * c + b * c);
        double Volume = a * b * c;
        System.out.println("A Téglatest felülete: " + SurfaceArea + " m2");
        System.out.println("A Téglatest térfogata: " + Volume + " m3");
    }
}
