package Java_Programs.ConditionalStatement;

import java.util.Scanner;

public class EligibileVote {
    public static void main(String[] args) {

        //Scanner class is used below
        Scanner sc = new Scanner(System.in);

        //Taking name as input

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println();

        //Taking age as input

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print(name + " ");

        int b = 17;

        // I have used iterative function below to solve this question.

        String val = (age > b)?"you can vote":"you can't vote";
            System.out.println(val);


    }
}
