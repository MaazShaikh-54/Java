// Parent class
class vehicle {
    void run() {
        System.out.println("Running...");
    }
}

// Subclass
class car extends vehicle {
    @Override
    void run() {
        System.out.println("Running car safely...");
    }
}

// Subclass
class bike extends vehicle {
    @Override
    void run() {
        System.out.println("Running bike safely...");
    }
}

// Subclss
class tata extends car {
    String color = "Red";

    void carColor() {
        System.out.println("Color of tata car is : " + color);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        tata obj = new tata();
        obj.run();
        obj.carColor();
        bike b = new bike();
        b.run();
    }
}
