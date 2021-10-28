package testing;
import java.util.Scanner;

public class ConversionTest { 
    public static void main(String[] args) {
        calculate_BMI();
    }

    private static void calculate_BMI() {
        System.out.print("Please enter your weight in kg: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("Please enter your height in cm: ");
        float height = s.nextFloat();


        float bmi = (100*100*weight)/(height*height);

        System.out.println("Your BMI is: "+bmi);
        printBMI_category(bmi);

    }
    private static void printBMI_category(float bmi) {
        if(bmi < 18.5) {
            System.out.println("You are underweight");
        }else if (bmi < 25) {
            System.out.println("You are normal");
        }else if (bmi < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
        }
    }
}
