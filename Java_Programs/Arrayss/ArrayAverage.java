package Arrayss;

public class ArrayAverage {
    public static void main(String[] args) {

        int[] arr = { 1,7,9,11,12};
        int sum = 0;
        int n = arr.length ;
        int max = 0;
        int max1 = 0;

        for (int i : arr) sum = sum + i;

        double avg = sum/n;
        System.out.println(avg);

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i -1];
            max = Math.max(arr[i],arr[i -1]);

        }
        System.out.println(max);

        for (int i = 1; i < arr.length; i++) {
            if( arr[i] >arr[i +1]){

            }


        }
        System.out.println(max);
    }
}

// Time complexity for the above program is O(n)