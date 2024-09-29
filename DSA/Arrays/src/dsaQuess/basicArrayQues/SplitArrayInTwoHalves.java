package DSA.Arrays.src.dsaQues;

import java.util.ArrayList;

/*
Split the Array into Two Halves
Problem: Divide the array into two equal halves (or as close as possible).
Approach: Determine the midpoint and create two new arrays containing the elements before and after the midpoint.
 */
public class SplitArrayInTwoHalves {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,7,89,12,0,2};

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arr.length/2; i++) {
            list.add(arr[i]);
        }
        for (int i = arr.length/2; i < arr.length; i++) {
            list2.add(arr[i]);
        }
        System.out.println(list);
        System.out.println(list2);
    }
}
