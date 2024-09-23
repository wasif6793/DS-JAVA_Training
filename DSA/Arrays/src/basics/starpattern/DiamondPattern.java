package basics.starpattern;
/*
 *
 ***
 *****
 *******
 *********
 ***********
 **********
 ********
 ******
 ****
 **

 */
public class DiamondPattern {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j < 5 - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 6; k > 5 - i * 2; k--) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 5 ; i >= 1; i--) {
            for(int j = 0; j <5 - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i * 2 -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
