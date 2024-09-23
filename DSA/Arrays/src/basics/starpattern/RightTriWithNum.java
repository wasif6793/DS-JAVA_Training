package basics.starpattern;

/*
Right-Angle Triangle with Incrementing Numbers
Problem: Print a right-angled triangle where each row contains incrementing numbers starting from 1.
Input: Number of rows n.
Output:
yaml
Copy code
1
12
123
1234
12345
 */
public class RightTriWithNum {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            for(int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
