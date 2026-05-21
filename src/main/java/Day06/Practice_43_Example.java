package Day06;

import java.util.Scanner;

public class Practice_43_Example {
    public static void main(String[] args) {

        // enter name and surname than seperate them
        Scanner reader=new Scanner(System.in);
        System.out.println("Please enter your name and surname" );
        String FullName=reader.nextLine();
        
        int space=FullName.indexOf(" ");
        String name=FullName.substring(0,space);
        String surname=FullName.substring(space+1);

        System.out.println("name = " + name);
        System.out.println("surname = " + surname);

    }
}
