import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("P:");
            int phy = scan.nextInt();
            System.out.println("E");
            int eng = scan.nextInt();
            System.out.println("C");
            int chem = scan.nextInt();
            System.out.println("M");
            int math = scan.nextInt();
            System.out.println("H");
            int hin = scan.nextInt();

            float percentage = ((phy + eng + chem + math + hin) / 500.0f) * 100;

            System.out.println("percentage is " + percentage);
        }
    }

}
