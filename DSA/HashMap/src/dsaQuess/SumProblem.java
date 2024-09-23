package dsaQuess;

import java.util.HashMap;

/*
Two Sum Problem (Easy)

Problem: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
Example:
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class SumProblem {
    public static void main(String[] args) {

        int arr[] = {2,7,11,15,3,6,5,4,2};
        int target = 9;

        HashMap<Integer,Integer> hm =new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <i; j++) {

                if(i !=j){
                    if(arr[i] + arr[j] == target) {
                        hm.put(i,j);
                    }
                }
            }
        }
        System.out.println(hm);
    }
}
