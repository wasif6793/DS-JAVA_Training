package dsaQuess;

import java.util.HashMap;

/*
Find Pairs with Given Sum
Problem: Find all pairs of integers in the array whose sum equals a given target.
Input: An array of integers and a target sum.
Output: Pairs of integers whose sum equals the target.
Example:
java
Copy code
Input: [1, 2, 3, 4, 5], target = 6
Output: [(1, 5), (2, 4)]
 */
public class PairGivenSum {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};

        int target = 7;

        HashMap<Integer,Integer> hash = new HashMap<>();

        for (int i = 0; i < arr.length /2; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    continue;
                }
                if (arr[i] + arr[j] == target) {
                    hash.put(arr[i], arr[j]);
                }
            }

        }
        System.out.println(hash);



    }
}
