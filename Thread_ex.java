import java.util.Scanner;

public class Thread_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Limit : ");
        N = sc.nextInt();
        sc.close();
        Thread_ex obj = new Thread_ex();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                obj.printEvenNumber();
            }
        });
        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                obj.printOddNumber();
            }
        });
        // Start both threads
        t1.start();
        t2.start();
    }

    int counter = 1;
    static int N;

    // Function to print odd numbers
    public void printOddNumber() {
        synchronized (this) {
            // Print number till the N
            while (counter < N) {
                // If count is even then print
                while (counter % 2 == 0) {
                    // Exception handle
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.print(counter + " ");
                // Increment counter
                counter++;
                // Notify to second thread
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber() {
        synchronized (this) {
            // Print number till the N
            while (counter < N) {
                // If count is odd then print
                while (counter % 2 == 1) {
                    // Exception handle
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.print(counter + " ");
                // Increment counter
                counter++;
                // Notify to 2nd thread
                notify();
            }
        }
    }
}
