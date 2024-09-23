package basics.starpattern;

/*
 Inverted Right-Angle Triangle with Numbers
Problem: Print an inverted right-angled triangle where each row contains the row number.
Input: Number of rows n.
Output:
yaml
Copy code
55555
4444
333
22
1
 */
public class InvertedNumRightTriangle {
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            for(int j = 1; j <= i;j++){
                System.out.print(i);
            }
            System.out.println();

        }
    }
}
