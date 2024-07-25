
package Arrayss;

import java.lang.*;

public class SortedArraySearch {

    //Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.
    public static void main(String[] args) {
        int K = 159;
        int N = 2;

        int[] arr = {1,987};

        Solution obj = new Solution();
        System.out.println(obj.searchInSorted(arr, N, K));
    }
}

    class Solution {
        static int searchInSorted(int arr[], int N, int K){

            while (N == 2){
                if(arr[0] == K || arr[1] == K){
                    return 1;
                }
                else {
                    return -1;
                }

            }


        // Your code here
        int start = 0;
        int end = arr.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == K) {
                return 1;

            }
            if (arr[mid] < K) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }

        return -1;

    }

}

// Time complexity for this program is O(Logn)

