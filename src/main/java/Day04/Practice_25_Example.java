package Day04;

import java.util.Scanner;

public class Practice_25_Example {
    public static void main(String[] args) {

        // print to screen to enter square field area from user

        Scanner reader=new Scanner(System.in);
        System.out.println("Pleaser enter side");
        int side=reader.nextInt();
        System.out.println("Total Area = " + side*4);
    }
}
