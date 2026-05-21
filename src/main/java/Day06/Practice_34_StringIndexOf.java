package Day06;

public class Practice_34_StringIndexOf {
    public static void main(String[] args) {

        //indexof  (letter) = give letter index

        String sentence="Hello World";

        System.out.println("sentence.indexOf(\"H\") = " + sentence.indexOf("H")); //0
        System.out.println("sentence.indexOf(\"l\") = " + sentence.indexOf("l"));
        System.out.println("sentence.indexOf(\"lo\") = " + sentence.indexOf("lo"));
        System.out.println("sentence.indexOf(\" \") = " + sentence.indexOf(" "));
        System.out.println("sentence.indexOf(\"A\") = " + sentence.indexOf("A"));

        System.out.println("sentence.indexOf(\"l\",6) = " + sentence.indexOf("l",6));
        // start to search l after 6 index
    }
}
