package Day05;

import java.util.Scanner;

public class Practice_30_Example {
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in); // for string
        System.out.println("Enter your street name=" );
        String street= reader.nextLine();
        System.out.println("Enter your country=" );
        String country=reader.nextLine();

        Scanner reader2=new Scanner(System.in); // for int
        System.out.println("Enter your postcode=");
        int postcode=reader2.nextInt();

        Scanner reader3=new Scanner(System.in); // for boolean
        System.out.println("Are you landlord ?");
        boolean owner=reader3.nextBoolean();

        String FullAddress=street+" "+country+" "+postcode+" "+owner;
        System.out.println("FullAddress = " + FullAddress);

    }
}
