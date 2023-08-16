import java.util.Scanner;

public class BankAccount {
    public static void main(String arg[]) {
        Scanner KB = new Scanner(System.in);

        // create initial accounts
        Long acc_no = null;

        // run loop until menu 5 is not pressed
        int ch;
        do {
            System.out.println(
                    "Main Menu\n1. Open Account\n2. Deposit\n3. Withdrawal\n4. Compute Interest\n5. Display Balance\n6. Account Details\n7. Exit");
            System.out.println("Ur Choice :");
            ch = KB.nextInt();
            switch (ch) {
            case 1:
                if (acc_no != null)
                    System.out.println("Account Already Created\n");
                else {
                    acc_no = (long) ((Math.random() * ((9999999999999999l - 1000000000000000l) + 1))
                            + 1000000000000000l);
                    System.out.println("Account No : " + acc_no);

                    Bank.openAccount(acc_no);
                }
                break;
            case 2:
                if (acc_no != null)
                    Bank.deposit();
                else
                    System.out.println("Open Account First\n");
                break;
            case 3:
                if (acc_no != null)
                    Bank.withdrawal();
                else
                    System.out.println("Open Account First\n");
                break;
            case 4:
                if (acc_no != null)
                    Bank.cI();
                else
                    System.out.println("Open Account First\n");
                break;
            case 5:
                if (acc_no != null)
                    System.out.println("Current Balance is : " + Bank.getBalance() + "\n");
                else
                    System.out.println("Open Account First\n");
                break;
            case 6:
                if (acc_no != null)
                    Bank.getDetails();
                else
                    System.out.println("Open Account First\n");
                break;
            case 7:
                System.out.println("Good Bye..");
                break;
            }
        } while (ch != 7);
        KB.close();
    }
}

class Bank {
    private static String accno;
    private static String name;
    private static double balance = 0;

    public Bank() {
    }

    static Scanner KB = new Scanner(System.in);

    // method to open an account
    static void openAccount(long no) {
        accno = no + "";
        System.out.print("Enter Name: ");
        name = KB.nextLine();
        System.out.println("Account Created");
        System.out.println("");
    }

    static void getDetails() {
        System.out.println("Account No : " + accno);
        System.out.println("Account Holder Name : " + name);
        System.out.println("Current Balance : " + getBalance());
        System.out.println("");
    }

    // method to deposit money
    static void deposit() {
        Double amt;
        System.out.println("Enter Amount You Want to Deposit : ");
        amt = KB.nextDouble();
        balance = balance + amt;
        System.out.println("Amount Deposited");
        System.out.println("");
    }

    // method to withdraw money
    static void withdrawal() {
        double amt;
        System.out.println("Enter Amount You Want to withdraw : ");
        amt = KB.nextDouble();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Withdraw of " + amt + " Successful");
        } else {
            System.out.println("Transaction Failed..\nErr: Insufficient Balance");
        }
        System.out.println("");
    }

    static void cI() {
        System.out.println("Enter Term in Months To Calculate Interest on Current Balance");
        System.out.print("Term (Months) : ");
        int t = KB.nextInt();
        System.out.println("Our Bank's ROI is 6%");
        double i = getBalance() * (0.06 * (t / 12));
        System.out.println("Interest after " + t + " months will be : " + i);
        System.out.println("");
    }

    static double getBalance() {
        return balance;
    }
}