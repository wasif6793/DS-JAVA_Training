package basics.starpattern;
/*
Zig-Zag Pattern
Problem: Print a zig-zag pattern of stars.
Input: Number of rows n.
Output:
markdown
Copy code
  *       *
*   *   *   *
*     *     *

 */
public class ZigZagPattern {
    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {

            for(int j = 0; j < 3; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 0; j < 6; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

        }
        for (int i = 0; i <= 3; i++) {
            System.out.print("*");
            for(int j = 0; j < 3; j++){
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.print("*");
            for(int j = 0; j <= 4; j++){
                System.out.print(" ");
            }

        }
        System.out.println("*");


    }
}
