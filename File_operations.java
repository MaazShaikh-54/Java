import java.io.File;
import java.io.IOException;

public class File_operations {
    public static void main(String[] args) {
        File f = new File("C:\\My Stuff\\online lecture\\Java\\Practical4_1.java");
        System.out.println(f.getAbsolutePath() + "\nExists : " + f.exists());
        File f1 = new File("C:\\My Stuff\\online lecture\\Java\\test.txt");
        System.out.println(f1.getAbsolutePath() + "\nExists : " + f1.exists());
        try {
            if (f1.createNewFile()) {
                System.out.println("File Created : " + f1.getName());
            } else {
                System.out.println("Error : File Not Created");
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
