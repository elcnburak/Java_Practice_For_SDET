package Day05;

import java.util.Scanner;

public class Practice_33_Example {
    public static void main(String[] args) {

        // print to enter sentences last character

        Scanner reader=new Scanner(System.in);
        System.out.println("Enter your sentences");
        String sentences=reader.nextLine();

        int length=sentences.length();
        char lastChar=sentences.charAt(length-1);
        System.out.println("lastChar = " + lastChar);
    }
}
