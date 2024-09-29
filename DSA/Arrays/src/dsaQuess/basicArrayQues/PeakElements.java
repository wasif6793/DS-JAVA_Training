package DSA.Arrays.src.dsaQues;

import java.util.ArrayList;
/*

 */
public class PeakElements {

    public static void main(String[] args) {
        peakelement();
    }

    private static void peakelement() {

        int arr[] = {2,3,1,3,9,3,1,3,5,5,6,7};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        if (n == 1) {

        }

        // Check first and last elements as possible peaks
        if (arr[0] >= arr[1]) {

        }
        if (arr[n - 1] >= arr[n - 2]) {

        }

        for (int i = 1; i < n - 1; i++) {
            if( arr[i] >= arr[i - 1]  && arr[i] >= arr[i  + 1]) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);


    }
}
