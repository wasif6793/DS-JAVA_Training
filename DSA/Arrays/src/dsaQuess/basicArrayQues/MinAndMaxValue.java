package DSA.Arrays.src.dsaQues;

/*
Find the Minimum and Maximum Element in an Array
Problem: Find the minimum and maximum elements in a single pass.
Approach: Traverse the array and track both the minimum and maximum values.
 */
public class MinAndMaxValue {
    public static void main(String[] args) {
        int arr[] = {12,2,34,5,6,7,5,7};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
