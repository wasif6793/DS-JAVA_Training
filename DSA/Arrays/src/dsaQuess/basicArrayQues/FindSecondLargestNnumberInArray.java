package DSA.Arrays.src.dsaQuess;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

//Find the Second-Largest Element in an Array
public class FindSecondLargestNnumberInArray {
    public static void main(String[] args) {

        numtwo();
    }

    private static void numtwo() {

        int a[] ={1,2,10,5,6,12,3,23,9};

        int lg = a[0];
        int sec = a[0];

        for(int i = 0; i< a.length; i++){
            if(a[i] > lg){
                lg = a[i];
            }
        }
        for(int i = 0;i <a.length;i++) {
            if (a[i] > sec) {
                if (a[i] < lg) {
                    sec = a[i];
                }
            }
        }
        System.out.println("Second largest number is: "+sec);

    }
}
