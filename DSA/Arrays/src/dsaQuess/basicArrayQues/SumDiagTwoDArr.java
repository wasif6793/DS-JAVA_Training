package dsaQuess;

import java.util.ArrayList;

/*
Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array. Task is to find the sum of the left diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between.

Example 1:

â€‹Input : arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}}
        and N = 3
brr[] = {3, 6, 9}
Output : 15 9
Explanation:
1 2 3
4 5 6
7 8 9
So, this sum of left diagonal (1+ 5 + 9) = 15
The maximum element in an array brr is 9
So, will return {15, 9} as an answer.
 */
public class SumDiagTwoDArr {
    public static void main(String[] args) {
       int arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}};
       int brr[] = {3, 6, 9, 2, 5, 9, 10,12};
       int N = 3;
       int sum = 0;
       int max = brr[0];

        ArrayList<Integer> list  = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( i == j) {
                    sum += arr[i][j];
                }

            }
        }

        for (int i = 1; i < brr.length; i++) {
            if(brr[i] > max) {
                max = brr[i];
            }
        }

        list.add(sum);
        list.add(max);
        System.out.println(list);

    }
}

