class student {
    String name;
    int id;

    student(String n) {
        name = n;
    }

    student(String n, int i) {
        this(n);
        id = i;
    }

    public student() {
    }

    void display() {
        System.out.println("Name : " + name + "\n id : " + id);
    }

    public void setInfo(String string, int i) {
    }

    public void setInfo(String string, int i, String string2) {
    }
}

public class chaining {
    public static void main(String[] args) {
        student s1 = new student("Maaz", 1);
        s1.display();
        student s2 = new student("Musab");
        s2.display();
    }
}