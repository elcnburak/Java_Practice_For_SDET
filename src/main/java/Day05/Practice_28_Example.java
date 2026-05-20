package Day05;

import java.util.Scanner;

public class Practice_28_Example {
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        System.out.println("Please enter your weight");
        double weight= reader.nextDouble();
        System.out.println("Please enter your height");
        double height= reader.nextDouble();

        System.out.println("your height = " + height+" "+"your weight = "+weight);
        System.out.println("Endeks = " +(weight/(height*height)));


    }
}
