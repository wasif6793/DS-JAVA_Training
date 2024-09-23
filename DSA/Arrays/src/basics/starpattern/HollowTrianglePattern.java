package basics.starpattern;
/*
Hollow Pyramid Pattern
Problem: Print a hollow pyramid pattern of stars.
Input: Number of rows n.
Output:
markdown
Copy code
    *
   * *
  *   *
 *     *
*********
 */
public class HollowTrianglePattern {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j =0; j< i * 2 - 1;j++){
                System.out.print(" ");
            }

            if(i >0 ){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < 9; i++) {
            System.out.print("*");

        }
    }
}
