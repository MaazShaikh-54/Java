/******************************************************************************
 * METHOD OVER-LOADING OR CONSTRUCTOR
 *******************************************************************************/

public class Main {
    static int id;
    static int age;
    static String name;

    // Non-argument constructor
    Main() {
        System.out.println("Welcome to constructor!\n");
    }

    // constructor with 2 paramter
    Main(int idNo, String n) {
        id = idNo;
        name = n;
    }

    // constructor with 3 paramter
    Main(int idNo, String n, int a) {
        id = idNo;
        name = n;
        age = a;
    }

    public static void main(String[] args) {

        System.out.println("Id = " + id + "\nName = " + name);

        System.out.println("\nId = " + id + "\nName = " + name + "\nAge = " + age);
    }
}