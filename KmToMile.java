import java.util.Scanner;

public class KmToMile {
    public static void main(String[] args) {
        System.out.println("Converting Km to Miles");
        System.out.println("Enter Km");
        try (Scanner Float = new Scanner(System.in)) {
            float Km = Float.nextFloat();
            float Mile = 0.621371f;
            float multiplyString = Km * Mile;
            System.out.println(Km + " Kilometer equals to " + multiplyString + " Miles");
        }
    }
}
