package Day06;

public class Practice_38_StringContains {
    public static void main(String[] args) {

        String sentence="Hello World";
        boolean YesOrNo=sentence.contains("e");
        System.out.println("YesOrNo = " + YesOrNo); // First method

        System.out.println("sentence.contains(\"e\") = " + sentence.contains("e")); // second method
        System.out.println("sentence = " + sentence.contains("lo"));
        System.out.println("sentence = " + sentence.contains("z"));
        System.out.println("sentence = " + sentence.contains("wo"));

    }
}
