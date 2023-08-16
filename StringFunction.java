public class StringFunction {
    public static void main(String[] args) {
        String s = "HELLO stRIng";
        String newStr = s.toLowerCase();
        String newStr1 = s.toUpperCase();
        System.out.println(newStr);
        System.out.println(newStr1);
        String s1 = " hello string ";
        System.out.println(s1 + "java");// without trim()
        System.out.println(s1.trim() + "java");
        String s2 = "this is index of example";
        int index1 = s2.indexOf("is");
        System.out.println(index1);
        String s3 = "javatpoint is a very good website";
        String replaceString = s3.replace('a', 'e');// replaces all occurrences of 'a' to 'e'
        System.out.println(replaceString);
    }
}
