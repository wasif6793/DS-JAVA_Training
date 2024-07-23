import java.util.Scanner;

public class EligibibleVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        int b = 17;

        String val = (age > b)?"You can vote":"You can't";
            System.out.println(val);


    }
}
