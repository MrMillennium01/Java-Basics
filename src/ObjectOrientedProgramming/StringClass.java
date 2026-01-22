import java.nio.charset.StandardCharsets;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "hello"; // Strings are immutable: when changed, a copy (deep copy) is given back
        String s2 = "hello";
        System.out.println(s1);
        s1 += "x";  // overwrite, but immutable
        System.out.println(s1);
        System.out.println(s1.equals(s2)); // always use that to compare two Objects
        System.out.println(s1==s2);
        System.out.println(s1.getBytes(StandardCharsets.UTF_8));
        System.out.println(s1.getBytes(StandardCharsets.US_ASCII));

        // StringBuffer: like String, but mutable; more efficient when changed regularly
        StringBuffer s3 = new StringBuffer("hello");
        System.out.println(s3);
        s3.append("x"); // + is not possible, you have to use append
        System.out.println(s3);
    }
}
