package Day05;

import java.util.Scanner;

public class Practice_26_Example {
    public static void main(String[] args) {

       Scanner reader= new Scanner(System.in);
        System.out.println("Please enter short edge");
        int shortEdge= reader.nextInt();
        System.out.println("Please enter long edge ");
        int longEdge=reader.nextInt();

        System.out.println("Total Area= " + (shortEdge+shortEdge+longEdge+longEdge));
        System.out.println("Total around=" + (shortEdge*longEdge));


    }
}
