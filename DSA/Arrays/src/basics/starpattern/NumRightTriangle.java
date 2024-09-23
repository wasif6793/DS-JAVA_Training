package basics.starpattern;

/*Right-Angle Triangle with Numbers
Problem: Print a right-angled triangle where each row contains the row number.
Input: Number of rows n.
Output:
yaml
Copy code
1
22
333
4444
55555
*/
public class NumRightTriangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }
}
