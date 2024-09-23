package basics.starpattern;

/* Print crown Pattern
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 */
public class CrownPatttern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 10; j > 2 * i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
