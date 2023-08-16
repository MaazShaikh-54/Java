import java.util.*;

public class Complex {
    double real, img;

    // Constructor
    Complex() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter real part: ");
            real = sc.nextDouble();
            System.out.print("Enter imaginary part: ");
            img = sc.nextDouble();
        }
    }

    // Add
    static void sum(Complex c1, Complex c2) {
        double totalR, totalI;
        totalR = c1.real + c2.real;
        totalI = c1.img + c2.img;
        System.out.println("Sum: " + (totalR) + " + " + (totalI) + " i");
    }

    // Difference
    static void difference(Complex c1, Complex c2) {
        double totalR, totalI;
        if (c1.real > c2.real) {
            totalR = c1.real - c2.real;
            totalI = c1.img - c2.img;
        } else {
            totalR = c2.real - c1.real;
            totalI = c2.img - c1.img;
        }

        System.out.println("Diff: " + (totalR) + " + (" + (totalI) + " ) i");
    }

    // Product
    static void product(Complex c1, Complex c2) {
        double totalR, totalI;
        totalR = ((c1.real * c2.real) - (c1.img * c2.img));
        totalI = ((c1.real * c2.img) + (c1.img * c2.real));
        System.out.println("Product: " + (totalR) + " + " + (totalI) + " i");
    }

    public static void main(String[] args) {
        System.out.println("Enter complex no :1");
        Complex c1 = new Complex();

        System.out.println("\nEnter complex no :2");
        Complex c2 = new Complex();

        sum(c1, c2);
        difference(c1, c2);
        product(c1, c2);
    }
}