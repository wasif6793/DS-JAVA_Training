package dsaQuess;

import java.util.ArrayList;
import java.util.HashMap;

/*
 Intersection of Two Arrays (Medium)

Problem: Given two arrays, write a function to compute their intersection.
Example:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
 */
public class IntersectionOfArrays {
    public static void main(String[] args) {
        intersectTwoArray();
    }

    private static void intersectTwoArray() {

        int a[] = {1,2,3,4,5,6};
        int b[] = {2,3,4};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : a){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int num : b){
            if(map.containsKey(num) && map.get(num) > 0){
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        System.out.println(result);
    }
}
