package basics.starpattern;

/*
Inverted Right-Angle Triangle
Problem: Print an inverted right-angled triangle of stars.
Input: Number of rows n.
Output:
markdown
Copy code
*****
****
***
**
*
 */
public class InvertedRightTriangle {
    public static void main(String[] args) {

        for (int i = 0; i <= 6; i++) {
            for (int j = 5 ; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
