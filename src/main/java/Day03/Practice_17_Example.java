package Day03;

public class Practice_17_Example {
    public static void main(String[] args) {

        //10/3 = 3.3333333 (real)
        //int / int  10/3=3 (integer)

        //double/int veya int/double veya double/double for decimal number

        int number1=10;
        int number2=3;

        int result=number1/number2;
        System.out.println("result = " + result);

        // if you want decimal number

        double doubleSonuc=number1/(double)number2;
        System.out.println("doubleSonuc = " + doubleSonuc);
    }
}
