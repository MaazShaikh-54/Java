// Parent class
interface Animal {
    public void eat();
}

// Subclass
class Lion implements Animal {
    public void eat() {
        System.out.println("EATING MEAT...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.eat();
    }
}
