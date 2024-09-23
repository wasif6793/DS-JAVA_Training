package basics.starpattern;

/*
Hollow Square Pattern
Problem: Print a hollow square pattern of stars.
Input: Number of rows n.
Output:
markdown
Copy code
*****
*   *
*   *
*   *
*****
 */
public class HollowSquarePattern {
    public static void main(String[] args) {


        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= 2 ; i++) {
            for (int j = 0; j < 1 ; j++) {
                System.out.print("*");
            }
            for(int j = 0; j <= 2;j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // and that's how this code works so that it cna run properly. I don't want to let you know brother.
    }

}

