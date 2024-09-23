package dsaQuess;

import java.util.HashMap;

/*
Count Frequency of Elements in an Array

Problem: Given an array of integers, use a HashMap to count the frequency of each element.
Input: An array of integers.
Output: A HashMap where keys are array elements and values are their frequencies.
Example:
java
Copy code
Input: [1, 2, 2, 3, 4, 4, 4]
Output: {1=1, 2=2, 3=1, 4=3}
 */
public class FreqOfElements {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,4};

        HashMap<Integer,Integer> hm = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    hm.put(arr[i], count);
                }

            }
        }

        System.out.println(hm);
        //System.out.println("element:" + arr[i] + count);

    }
}
