import java.awt.*;
import java.awt.event.*;

public class JavaAWTExample extends Frame implements ActionListener {
    Frame f;
    Button b;
    Label l;
    TextField tf;
    Choice c;
    List l1;

    JavaAWTExample() {
        f = new Frame("Java AWT Example");

        b = new Button("Click Me!");
        b.setBounds(20, 50, 150, 30);
        b.addActionListener(this);

        l = new Label();
        l.setBounds(20, 100, 250, 30);

        tf = new TextField();
        tf.setBounds(20, 150, 300, 30);

        c = new Choice();
        c.setBounds(20, 200, 200, 30);
        c.add("Item 1");
        c.add("Item 2");
        c.add("Item 3");
        c.add("Item 4");
        c.add("Item 5");

        l1 = new List(5);
        l1.setBounds(20, 250, 100, 50);
        l1.add("Item 1");
        l1.add("Item 2");
        l1.add("Item 3");
        l1.add("Item 4");
        l1.add("Item 5");

        f.add(b);
        f.add(l);
        f.add(tf);
        f.add(c);
        f.add(l1);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Java AWT Example");
        tf.setText("Let's learn Java AWT");
    }

    public static void main(String[] args) {
        new JavaAWTExample();
    }
}