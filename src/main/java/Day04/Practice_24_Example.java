package Day04;

import java.util.Scanner;

public class Practice_24_Example {
    public static void main(String[] args) {

        // Print sum two numbers to enter from user

        Scanner reader=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber=reader.nextInt();
        System.out.println("Enter second number");
        int secondNumber=reader.nextInt();

        System.out.println("Sum=" +(firstNumber+secondNumber));
    }
}
