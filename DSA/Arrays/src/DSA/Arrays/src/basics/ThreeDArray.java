package DSA.Arrays.src.basics;

public class ThreeDArray {
    public static void main(String[] args) {

        int ar[][][] = {{{9,9,9},{6,6,6},{1,1,1}}};

//        for (int i = 0; i < ar.length; i++) {
//            for (int j = 0; j < ar[i].length; j++) {
//                System.out.print(ar[i][j] + " ");
//            }
//
//        }
        int val = 0;
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < ar[i].length; j++) {
                for (int k = 0; k < ar[i][j].length; k++) {
                    val += ar[i][j][k];
                    System.out.print(ar[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(val);
    }


}
