package Day03;

public class Practice_14_TypeTransformation {
    public static void main(String[] args) {

        byte Score1=5;
        byte Score2=9;
        byte Score3=9;
        byte Score4=10;

         //  calculate total score

        int totalScore=Score1+Score2+Score3+Score4;

        // int bigger than byte

        byte totalScore1=(byte)totalScore;

        System.out.println("totalScore = " + totalScore);
        System.out.println("totalScore1 = " + totalScore1);

    }
}
