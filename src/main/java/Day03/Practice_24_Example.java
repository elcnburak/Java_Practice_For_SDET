package Day03;

import java.util.Scanner;

public class Practice_24_Example {
    public static void main(String[] args) {
        // to print name and surname to enter seperatly from user

        Scanner reader=new Scanner(System.in);
        System.out.println("Please enter name");
        String name= reader.nextLine();
        System.out.println("Please enter surname" );
        String surname= reader.nextLine();

        System.out.println("Name and Surname=" + name+" "+surname);
    }
}
