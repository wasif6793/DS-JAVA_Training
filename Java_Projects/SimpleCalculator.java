package Java_Projects;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        calculator();
    }

    static void calculator(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Input first value: ");
        int val1 = sc.nextInt();

        System.out.println();

        System.out.print("Input second value: ");
        int val2 = sc.nextInt();

        System.out.print("Select operator '*, /, +, - :");

        String operator = sc.next();

            double result;

            switch (operator){
                case "*":

                    result = val1 * val2;
                    System.out.println("Answer: " + result);
                    break;

                case "+":
                    result = val1 + val2;
                    System.out.println("Answer: " + result);
                    break;

                case "-":
                    result = val1 - val2;
                    System.out.println("Answer: " + result);
                    break;

                case "/":
                    if(val2 == 0){
                        System.out.println("Not define");
                    } else {
                        result = (double) val1 / val2;
                        System.out.println("Answer: " + result);
                    }
                    break;

                default:
                    System.out.println("Not a valid operation.");
            }





    }
}
