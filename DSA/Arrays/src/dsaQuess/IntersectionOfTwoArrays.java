package DSA.Arrays.src.dsaQues;

import java.util.ArrayList;

/*
Find the Intersection of Two Arrays
Problem: Find the intersection (common elements) of two arrays.
Input: Two arrays of integers.
Output: An array containing the common elements.
Example:
java
Copy code
Input: [1, 2, 2, 1], [2, 2]
Output: [2, 2]
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

        int arr[] = {1,2,1};
        int arr2[] = {2,2};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr2[i] == arr[j]) {
                    list.add(arr2[j]);
                    arr2[j] = 0;
                    break;
                }
            }
        }

        System.out.println(list);
    }
}
