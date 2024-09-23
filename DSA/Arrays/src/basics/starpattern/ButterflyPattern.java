package basics.starpattern;

/*
Butterfly Pattern
Problem: Print a butterfly pattern of stars.
Input: Number of rows n.
Output:
markdown
Copy code
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
 */
public class ButterflyPattern {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 10; j > i * 2; j--){
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }


            System.out.println();

        }

        for (int i = 0; i <= 5; i++) {
            for(int j = 0; j <= 5 - i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < i * 2; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <=5 - i; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
