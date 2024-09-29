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

Not a good code ... visit SecondLargestNnumberInArray
 */
public class SecondLargestElement {
    public static void main(String[] args) {

        int arr[] = {10,5,20,8};

        int[] list = new int[arr.length];
        list = arr;
        int max = list[0];
        int num = 0;


        for (int i = 0; i < list.length - 1; i++) {
            if(list[i] > list[num]){
                num = i;
            }
        }
        list[num] = 0;

        for (int i = 0; i < list.length - 1; i++) {
            if(list[i] > max){
                max = list[i];
            }
        }
        System.out.println(max);



    }
}
