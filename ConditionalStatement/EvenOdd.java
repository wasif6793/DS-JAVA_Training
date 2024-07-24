import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: " );

        int num = sc.nextInt();

        System.out.print(num + " ");

       String val = (num % 2) == 0?"is Even Number.":"is Odd Number.";
        System.out.println(val);


    }
}
