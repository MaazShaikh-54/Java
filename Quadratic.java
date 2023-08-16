import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Taking input from the user
            System.out.println("Enter coefficient of equation( aX^2 + bX + c = 0 )");
            System.out.print("a =");
            double x = input.nextDouble();
            System.out.print("b =");
            double y = input.nextDouble();
            System.out.print("c =");
            double z = input.nextDouble();
            double determinant, root1, root2;
            // Calculating determinant
            determinant = y * y - (4 * x * z);
            // Checking whether determinant is positive
            if (determinant >= 0) {
                root1 = (-y + Math.sqrt(determinant)) / (2 * x);
                root2 = (-y - Math.sqrt(determinant)) / (2 * x);
                System.out.println("Root1 = " + root1);
                System.out.println("Root2 = " + root2);
            }
            // Checking whether determinant is negative
            else {
                System.out.println("There are no real root");
            }
        }
    }
}
