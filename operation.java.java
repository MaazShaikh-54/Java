import java.util.*;

public class operation
{
    static int num ;
    static int fact = 1;
    
    // Input number
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = sc.nextInt();
    }
    
    // Factorial method
    public int factorial(int n) {
        for(int i = 1; i<=n; i++) {
            fact = fact * i ;
        }
        return fact ;  
    }
    
    // Armstrong number
    public void testArmstrong(int n) {
        double rem , armstrongNumber = 0 ;
	    int originalNumber = n ;
	    int digit = 0 ;
	    while(n != 0){
	        n = n / 10;
	        digit++;
	    }
	    n = originalNumber;
	    while(n != 0)
	    {
	        rem = n % 10 ;
	        armstrongNumber = armstrongNumber + Math.pow(rem,digit) ;
	        n = n / 10 ;
	    }
	    if(originalNumber == armstrongNumber)
	    {
	        System.out.println(originalNumber + " is Armstrong number");
	    }
	    else
	    {
	        System.out.println(originalNumber + " is not Armstrong number");
	    }
    } 
    
    // Pallindrome
    public void testPallindrome(int n) {
        int number = n ;
	    int rem , reverse = 0 ;
	    while(n != 0){
	        rem = n % 10 ;
	        reverse = (reverse * 10) + rem ;
	        n = n / 10 ;
	    }
	   // System.out.println("Reverse of " + number + " is " + reverse);
	    if(number == reverse){
	        System.out.println("Number " + number + " is palindrome.");
	    }
	    else{
	        System.out.println("Number " + number + " is not a palindrome.");
	    }
    }
    
    // Prime
    public void testPrime(int n) {
         int flag = 0 ;
	    for(int i = 2 ; i <=n - 1 ; i++)
	    {
	        if(n % i == 0)
	        {
	           flag = 1 ;
	           break;
	        }
	    }
	        if(flag == 1)
	        {
	            System.out.println(n + " is not a Prime number");
	        }
	        else
	        {
	            System.out.println(n + " is a Prime number");
	        }
    }
    
    // Fibonacci Series
    public void fibonacciSeries(int n) {
		int firstTerm = 0;
		int secondTerm = 1;
		int temp ;
		System.out.print("Fibonacci series : ");
		System.out.print(firstTerm +" " + secondTerm + " ");
		for(int i = 0; i < n-2; i++) {
		    temp = firstTerm + secondTerm;
		    firstTerm = secondTerm ;
		    secondTerm = temp ;
		    System.out.print(secondTerm + " ");
		}
    }
    
	public static void main(String[] args) {
	    operation ob = new operation();
	    int ch ;
        do {
            System.out.println("\nENTER '1' FOR FACTORIAL ,'2' FOR TESTING ARMSTRONG ,'3' FOR TESTING PALLINDROME ,'4' FOR TESTING PRIME ,'5' FOR FIBONACCI SERIES");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            System.out.println();
            
            switch(choice) {
                case 1 :
                    ob.input();
                    ob.factorial(num);
                     System.out.println("Factorial of " + num + " is " + fact);
                break;
                
                case 2 :
                    ob.input();
                    ob.testArmstrong(num);
                break;
                
                case 3 :
                    ob.input();
                    ob.testPallindrome(num);
                break;
                
                case 4 :
                    ob.input();
                    ob.testPrime(num);
                break;
                
                case 5 :
                    ob.input();
                    ob.fibonacciSeries(num);
                break;
                
                default :
                System.out.println("Invalid choice");
            }
            System.out.println("\nEnter 1 for continue and 0 for exit");
            ch = sc.nextInt();
        } while(ch==1);
	}
}
