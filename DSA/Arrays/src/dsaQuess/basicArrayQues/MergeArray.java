package DSA.Arrays.src.dsaQues;

import java.util.ArrayList;

public class MergeArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] ={4,5,6};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            list.add(arr2[i]);

        }
        System.out.println(list);
    }
}
