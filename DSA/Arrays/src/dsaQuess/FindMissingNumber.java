package DSA.Arrays.src.dsaQues;

import java.util.ArrayList;

// Here I am going to find the missing number in a sorted array
public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,8};

        // creating arraylist to store missing data
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i - 1] + 1;
            if(num != arr[i]){
                list.add(num);

            }
        }
        System.out.println(list);
    }
}
