package basics.starpattern;

/*
Pyramid Pattern
Problem: Print a pyramid pattern of stars.
Input: Number of rows n.
Output:
markdown
Copy code
    *
   ***
  *****
 *******
*********
 */
public class PyramidPattern {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for(int j = 0 ; j <= 5 - i ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i -1; k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
