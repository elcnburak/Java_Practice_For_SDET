package Day06;

import java.util.Scanner;

public class Practice_36_Example {
    public static void main(String[] args) {
        // Enter name and surname. Print to screen first letter
        // Example: Elcin Burak  E.B.

        Scanner reader= new Scanner(System.in);
        System.out.println(" Please Enter your name and surname");
        String name=reader.nextLine();

        char firstLetterName=name.charAt(0);
        int spaceIndex=name.indexOf(" ");
        char firstLetterSurname=name.charAt(spaceIndex+1);

        System.out.println("firstLetterName = " + firstLetterName +"."+firstLetterSurname+".");

    }
}
