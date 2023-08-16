class student2 {
    String name, address;
    int age;

    student2() {
        name = "unknown";
        address = "not available";
        age = 0;
    }

    void setInfo(String n, int a) {
        name = n;
        age = a;
    }

    void setInfo(String n, int a, String add) {
        name = n;
        age = a;
        address = add;
    }

    void display() {
        System.out.println("Name : " + name + "\nAge : " + age + "\nAddress : " + address + "\n\n");
    }
}

public class studentDetail {
    public static void main(String[] args) {
        student[] s = new student[10];
        s[0] = new student();

        s[0].setInfo("Zayn", 28, "Bradford");
        s[1] = new student();
        s[1].setInfo("Harry", 25, "LA");
        s[2] = new student();
        s[2].setInfo("Musab", 17);
        s[3] = new student();
        s[3].setInfo("Liam", 26, "Wolverhampton");
        s[4] = new student();
        s[4].setInfo("Niall", 26, "Mullingar");
        s[5] = new student();
        s[5].setInfo("kashif", 16);
        s[6] = new student();
        s[6].setInfo("Louis", 29, "Doncaster");
        s[7] = new student();
        s[7].setInfo("Maaz", 18, "Mumbai");
        s[8] = new student();
        s[8].setInfo("Justin", 28, "Toronto");
        s[9] = new student();
        s[9].setInfo("Millie", 17);
        for (int i = 0; i < 10; i++) {
            s[i].display();
        }
    }
}