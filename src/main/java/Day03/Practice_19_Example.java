package Day03;

public class Practice_19_Example {
    public static void main(String[] args) {

        String score1="82";
        String score2="95";
        String score3="56";

        double average;

        double number1=Integer.parseInt(score1);
        double number2=Integer.parseInt(score2);
        double number3=Integer.parseInt(score3);

        average=(number1+number2+number3)/3;

        System.out.println("average = " + average);
    }
}
