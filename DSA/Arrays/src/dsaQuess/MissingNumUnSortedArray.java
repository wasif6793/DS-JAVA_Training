package DSA.Arrays.src.dsaQues;

/*
Find the Missing Number in an Array
Problem: Given an array containing n-1 numbers from 1 to n, find the missing number.
Input: An array of integers from 1 to n with one number missing.
Output: The missing number.
Example:
java
Copy code
Input: [1, 2, 4, 5, 6]
Output: 3

FOR UNSORTED ARRAY
 */
public class MissingNumUnSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,6};

        int num = arr[arr.length - 1];
        int val = 0;

//        for (int i = 0; i < arr.length; i++) {
//            if (num < arr[i] ) {
//                num = arr[i];
//            }
//        }

        int sum = (num * ( num + 1))/2;


        for (int i = 0; i < arr.length; i++) {
            val = val + arr[i];
        }

        System.out.println(sum - val);



    }
}
