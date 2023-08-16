class Teacher {
    String name;
    int id;

    void display() {
        System.out.println(id + " " + name);
    }
}

class Professor extends Teacher {
    Professor(int i, String n) {
        id = i;
        name = n;
    }
}

class Associate_professor extends Teacher {
    Associate_professor(int i, String n) {
        id = i;
        name = n;
    }
}

class Assistant_professor extends Teacher {
    Assistant_professor(int i, String n) {
        id = i;
        name = n;
    }
}

class Demo {
    public static void main(String args[]) {
        Professor p = new Professor(1, "John");
        p.display();
        Associate_professor p1 = new Associate_professor(2, "Fredy");
        p1.display();
        Assistant_professor p2 = new Assistant_professor(3, "Aryan");
        p2.display();
    }
}