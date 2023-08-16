public class Exeption_handling {
    public static void main(String[] args) {
        try {
            getName();
        } catch (Exception e1) {
            System.out.println(e1.toString());
        }
        try {
            double i = 1 / 0;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private static void getName() throws Exception {
        String name[] = { "Maaz", "Shaikh" };
        System.out.println(name[3]);
    }
}
