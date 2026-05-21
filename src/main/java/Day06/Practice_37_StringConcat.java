package Day06;

public class Practice_37_StringConcat {
    public static void main(String[] args) {

        String s1="Hello";
        String s2="World";

        System.out.println("Concat = " + s1+s2);
        System.out.println("Concat = " + s1.concat(s2));
        System.out.println("Concat = " + s1.concat(" ").concat(s2));
        System.out.println("Concat = " + s1.concat(" ")+s2);

    }
}
