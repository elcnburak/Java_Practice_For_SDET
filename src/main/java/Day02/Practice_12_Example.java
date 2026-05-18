package Day02;

public class Practice_12_Example {
    public static void main(String[] args) {

        // Question: Enter a person's weight (kg) and height (m).
        // Weight and height should be decimal numbers.
        // After printing "Your weight: ...." and "Your height: ......"
        // calculate the Body Mass Index (BMI): weight / (height * height)
        
         double weight=74.6;
         double height=170.4;
         
         double bodyMass=weight/(height*height);

        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("bodyMass = " + bodyMass);
    }
}
