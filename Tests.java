import java.util.Scanner;
import java.lang.Math;

public class Tests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        do {
            System.out.print(
                    "1. Get Factorial\n2. Check for Armstrong Number\n3. Check for Palindrome\n4. Check Prime\n5. fibonacciSeries\n6. Exit\nEnter Choice Code to Continue : ");
            c = sc.nextInt();
            int n;
            switch (c) {
            case 1:
                System.out.print("\nEnter Number To find Factorial : ");
                n = sc.nextInt();
                int fact = 1;
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + n + " is " + fact);
                System.out.println();
                break;
            case 3:
                System.out.print("\nEnter Value to Check FOr Palindrome : ");
                String s = sc.next();
                if (s.equalsIgnoreCase((new StringBuilder(s).reverse().toString())))
                    System.out.println("Entered Value \"" + s.toUpperCase() + "\" is a Palindrome");
                else
                    System.out.println("Entered Value \"" + s.toUpperCase() + "\" is NOT a Palindrome");
                System.out.println();
                break;
            case 4:
                System.out.print("\nEnter Value : ");
                n = sc.nextInt();
                int ch = 0;
                for (int i = 1; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        ch++;
                        break;
                    }
                }
                if (ch > 0) {
                    System.out.println(n + " is a prime number");
                } else {
                    System.out.println(n + " is not a prime number");
                }
                System.out.println();
                c = 4;
                break;
            case 5:
                System.out.print("\nEnter Length of Fibonacci Series You want to see : ");
                n = sc.nextInt();
                int n1 = 0, n2 = 1;
                System.out.print(n1 + " " + n2);// printing 0 and 1

                for (int j = 2; j < n; ++j)// loop starts from 2 because 0 and 1 are already printed
                {
                    int n3 = n1 + n2;
                    System.out.print(" " + n3);
                    n1 = n2;
                    n2 = n3;
                }
                System.out.println("\n");
                break;

            case 2:
                System.out.print("\nEnter Integer to check for Armstrong Number : ");
                n = sc.nextInt();
                System.out.println("\"" + n + "\" is " + (isArmstrong(n) ? "" : "NOT ") + "an Armstrong Number");
                System.out.println();
                break;
            default:
                break;
            }
        } while (c != 6);
        sc.close();
    }

    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }

        if (n == sum)
            return true;
        else
            return false;
    }

}