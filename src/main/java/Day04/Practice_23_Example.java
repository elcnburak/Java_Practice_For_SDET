package Day04;

import java.util.Scanner;

public class Practice_23_Example {
    public static void main(String[] args) {
        
        // Print to name and surname enter from user

        Scanner reader=new Scanner(System.in);
        System.out.println("Please enter your name and surname");
        String nameSurname= reader.nextLine();
        System.out.println("nameSurname = " + nameSurname);

    }
}
