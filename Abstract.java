// Parent class
abstract class Animal {
    abstract public void eat();
}

// Subclass
class Lion extends Animal {
    public void eat() {
        System.out.println("EATING MEAT...");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.eat();
    }
}