class Student {
    int id;
    String name;
}

class TestStudent2 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.id = 456;
        s1.name = "Maaz";
        System.out.println(s1.id + " " + s1.name);// printing members with a white space
    }
}