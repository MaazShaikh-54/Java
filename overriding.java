// Parent class
class Animal {
    void eat() {
        System.out.println("EATING...");
    }
}

// Subclass
class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("EATING MEAT...");
    }
}

public class overriding {
    public static void main(String[] args) {
        Animal obj = new Lion();
        obj.eat();
    }
}