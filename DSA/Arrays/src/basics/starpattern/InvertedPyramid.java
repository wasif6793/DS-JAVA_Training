package basics.starpattern;

/*
Inverted Pyramid Pattern
Problem: Print an inverted pyramid pattern of stars.
Input: Number of rows n.
Output:
markdown
Copy code
*********
 *******
  *****
   ***
    *
 */
public class InvertedPyramid {
    public static void main(String[] args) {
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 5 - i; j > 0 ; j--) {
//                System.out.println(" ");
//            }
//            for(int k = i * 2 - 1; k >=1; k--){
//                System.out.print("*");
//            }
//
//        }

        for (int i = 0; i <= 5; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 6; k >= i * 2; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }


}
