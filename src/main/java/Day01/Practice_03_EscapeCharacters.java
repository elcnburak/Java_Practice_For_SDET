package Day01;

public class Practice_03_EscapeCharacters {
    public static void main(String[] args) {
  /*
        \n = moves to a new line
        \t = acts like pressing the Tab key, creates a few spaces
        \b = acts like the Backspace key, deletes one character backwards
        \" = used to print double quotation marks
        \\ = used to print a backslash (\)
        \r = moves the cursor to the beginning of the line

   */

        System.out.println("HelloWorld");
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tWorld");
        System.out.println("Hello\bWorld");
        System.out.println("Hello\"World");
        System.out.println("Hello\\World");
        System.out.println("Hello\rWorld");

    }
}
