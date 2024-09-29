package DSA.Arrays.src.dsaQuess;

import java.util.HashMap;

public class TwoSumTarget {

    public static void main(String[] args) {

        int ar[]  = {1,2,3,4,5,6,7,8};
        int  k = 10;

        HashMap<Integer, Integer> hm = new HashMap<>();

        int l = 0;
        int r = ar.length-1;

        while( l < r){
            int sum = ar[l] + ar[r];
            if(sum == k){
                hm.put(ar[l], ar[r]);
                l++;
            } else if(sum > k){
                r--;
            } else {
                l++;
            }


        }
        System.out.println(hm);
    }

}
