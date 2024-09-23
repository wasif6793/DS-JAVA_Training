package DSA.Arrays.src.dsaQues;


import java.util.ArrayList;
/*
 Find the Second Largest Element
Problem: Find the second largest element in the array.
Input: An array of integers.
Output: The second largest element.
Example:
java
Copy code
Input: [10, 5, 20, 8]
Output: 10
 */

//Find the Second Largest Element in an Array
public class FindSecondLargestNnumberInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,7,55,0,9};
        int val = arr[0];
        int num  = 1;
        ArrayList<Integer> list = new ArrayList<>();

        while(num <0){
            for (int i = 1; i < arr.length; i++) {
                if(val < arr[i]){
                    val = arr[i];
                }
            }


            num--;
        }
    }
}
