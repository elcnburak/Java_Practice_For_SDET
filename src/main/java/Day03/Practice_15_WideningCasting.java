package Day03;

public class Practice_15_WideningCasting {

    public static void main(String[] args) {

//// Smaller type can be assigned to a larger type (Widening)
//// byte > short > int > long > float > double
//// There is definitely no data loss

        int number=9;
        long total=500;
        double proportion=3.2;

        proportion=number; // int>double widening no data loss
        System.out.println("proportion = " + proportion);

        total=number;  // int>long widening no data loss
        System.out.println("total = " + total);

        proportion=total; // long>double widening no data loss
        System.out.println("proportion = " + proportion);





    }
}
