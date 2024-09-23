package basics.starpattern;
/*
1     5
 2   4
   3
 2   4
1     5
 */
public class CrossNum {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {

                if(i == j){
                    System.out.print(i);
                }else if( j == 6 - i){
                    System.out.print(j);

                }else{
                    System.out.print(" ");
                }

            }

            System.out.println();

        }
    }
}
