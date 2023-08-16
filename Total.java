class Adder { 
 
    private int total; 
     
    int getTotal() 
    {         
        return total; 
    } 
     
    void addNum(int number) 
    {          
        total += number; 
    } 
} 
 
public class Total 
{ 
    public static void main(String[] args) 
    {         
        Adder a = new Adder();         
        a.addNum(10); 
        a.addNum(20); 
        a.addNum(30); 
         
        System.out.println(a.getTotal()); 
    } 
} 
