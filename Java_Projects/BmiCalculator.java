package Java_Projects;

import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter your height in Centimeters or cm: ");
            double height = sc.nextDouble();
            double heightinmeters = height / 100;

            System.out.print("Enter your wieght in kgs: ");
            double weight = sc.nextDouble();

            double bmi = weight / (heightinmeters * heightinmeters);

            System.out.print("Your BMI is " + bmi +"\n");
            //System.out.println();
            System.out.println("***************************************");
            System.out.println();
        }


    }
}
