package Day04;

public class Practice_20_Example {
    public static void main(String[] args) {

        String name="Elcin Burak";
        int classNo=11;
        char branch='B';
        boolean pass=true;

        System.out.println("name = " + name+" "+classNo+" "+branch+" "+pass);

        // I concatenate from left to right.
        // If there is a string on the left, I automatically convert the next value to a string and append it.

        System.out.println("Hello"+1+2);
        System.out.println(1+2+"Hello");

        // number convert to string

        int number=56;
        String stringNumber=String.valueOf(number);
        System.out.println("number = " + stringNumber);
    }
}
