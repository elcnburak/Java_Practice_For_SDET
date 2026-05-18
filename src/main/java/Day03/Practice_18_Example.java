package Day03;

public class Practice_18_Example {
    public static void main(String[] args) {

        String donation1="500";
        String donation2="1000";
        System.out.println("donation1 = " + donation1+donation2); // 5001000 text

        //if you want to cover to number
        // string>int

        int donation11=Integer.parseInt(donation1);
        int donation21=Integer.parseInt(donation2);

        System.out.println(donation11+donation21); // 1500
    }
}
