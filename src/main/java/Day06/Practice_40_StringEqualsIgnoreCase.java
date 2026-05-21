package Day06;

public class Practice_40_StringEqualsIgnoreCase {
    public static void main(String[] args) {

        String s1="Hello";
        String s2="HELLO";

        System.out.println("s1 = " + s1.equals(s2)); // false
        System.out.println("s1 = " + s1.equalsIgnoreCase(s2)); // true
    }
}
