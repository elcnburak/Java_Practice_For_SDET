package Day03;

public class Practice_16_NarrowingCasting {
    public static void main(String[] args) {

        int total=6700;
        byte number=5;

        number=(byte) total; // int> byte
        System.out.println("number = " + number); // data loss

        double proportion=3.7;
        total= (int) proportion; // double >int
        System.out.println("total = " + total); // data loss
    }
}
