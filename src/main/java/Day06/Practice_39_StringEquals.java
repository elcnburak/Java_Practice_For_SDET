package Day06;

public class Practice_39_StringEquals {
    public static void main(String[] args) {

        String s1="Hello";
        String s2="World";

        boolean trueOrfalse=s1.equals(s2); // 1. method
        System.out.println("trueOrfalse = " + trueOrfalse);

        System.out.println("s1 = " + s1.equals(s2)); // 2.method
        System.out.println("s1 = " + s1.equals("Hello"));

    }
}
