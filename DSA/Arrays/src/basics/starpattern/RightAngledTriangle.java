package basics.starpattern;

/*
Problem: Print a right-angled triangle of stars.
Input: Number of rows n.
Output:
*
**
***
****
*****
 */
public class RightAngledTriangle {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
