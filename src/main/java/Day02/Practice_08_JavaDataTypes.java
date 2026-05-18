package Day02;

public class Practice_08_JavaDataTypes {
    public static void main(String[] args) {


        //Integer Numbers

        byte byteValue=7; // Used for numbers between -128 and 127.

        short shortValue=1645; // Used for numbers between -32,000 and 32,000.

        int intValue=35000;  // Range is approximately -2.5 billion to +2.5 billion.
        // In Java, numeric values are considered int by default.

        long longValue=333444444444444444l; // Since numbers are treated as int by default,
        // long values must end with 'L'.

        //decimal numbers

        double doubleValue=3.144444577; // Has about 16 digits of precision after the decimal point. DEFAULT
        float floatValue=3.141245f; // Called a less precise floating-point type.
        // Uses less memory, but is generally less preferred.

        //word and letter

        char letter='E'; // Written inside single quotes.
        String name="Canan"; // Strings are written inside double quotes.

        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("letter = " + letter);
        System.out.println("name = " + name);


    }
}
