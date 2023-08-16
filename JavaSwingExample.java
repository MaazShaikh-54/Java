import javax.swing.*;

public class JavaSwingExample {
    JFrame f;
    JButton b;
    JLabel l;
    JTextField tf;
    JRadioButton r1, r2;
    JComboBox cb;

    JavaSwingExample() {
        f = new JFrame("Java Swing Example");

        b = new JButton("Click Me!");
        b.setBounds(20, 50, 150, 30);

        l = new JLabel("Java Swing Example");
        l.setBounds(20, 100, 250, 30);

        tf = new JTextField("Let us learn Java Swing");
        tf.setBounds(20, 150, 300, 30);

        r1 = new JRadioButton("A) Male");
        r2 = new JRadioButton("B) Female");
        r1.setBounds(20, 200, 100, 30);
        r2.setBounds(20, 250, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        String country[] = { "India", "USA", "Australia", "New Zealand" };
        cb = new JComboBox(country);
        cb.setBounds(20, 300, 100, 30);

        f.add(b);
        f.add(l);
        f.add(tf);
        f.add(r1);
        f.add(r2);
        f.add(cb);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JavaSwingExample();
    }
}