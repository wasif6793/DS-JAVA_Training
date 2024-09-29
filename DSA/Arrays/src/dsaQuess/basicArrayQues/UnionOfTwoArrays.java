package DSA.Arrays.src.dsaQues;

import java.util.ArrayList;

/*
Find the Union of Two Arrays
Problem: Find the union of two arrays, which includes all elements from both arrays without duplicates.
Input: Two arrays of integers.
Output: An array containing the union of both arrays.
Example:
java
Copy code
Input: [1, 2, 3], [2, 3, 4]
Output: [1, 2, 3, 4]
 */
public class UnionOfTwoArrays {
    public static void main(String[] args) {

        int arr[] = {1,2,3,5,6,7};
        int arr2[] = {2,3,4,9,12,14};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);

        }
        for (int j = 0; j < arr2.length; j++) {
            if (list.contains(arr2[j])) {
                continue;
            } else {
                list.add(arr2[j]);
            }
        }

//            for (int j = 0; j < arr2.length ; j++) {
//                if(arr[j] != arr2[j]) {
//                    list.add(arr2[j]);
//                }
//            }
        System.out.println(list);
    }
}
