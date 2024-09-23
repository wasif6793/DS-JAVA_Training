package basics.starpattern;

/*
Hourglass Pattern
Problem: Print an hourglass pattern of stars.
Input: Number of rows n.
Output:
markdown
Copy code
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
 */
public class HourGlassPattern {
    public static void main(String[] args) {

        for (int i = 5; i >= 0; i--) {

            for(int j = 0; j < 5- i; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j <= 2 * i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
