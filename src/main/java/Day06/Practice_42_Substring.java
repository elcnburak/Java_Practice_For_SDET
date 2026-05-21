package Day06;

public class Practice_42_Substring {
    public static void main(String[] args) {

        // substring= takes a part of the word

        String s1="I love Java";
        String take1=s1.substring(2,11); // from 2 to 11
        System.out.println("take1 = " + take1);
        System.out.println("take1.substring(2) = " + take1.substring(2)); // from 2 to all

    }
}
