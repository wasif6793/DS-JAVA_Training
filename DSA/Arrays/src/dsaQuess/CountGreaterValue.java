package dsaQuess;

/*
Find the Minimum and Maximum Element in an Array
Problem: Find the minimum and maximum elements in a single pass.
Approach: Traverse the array and track both the minimum and maximum values.
 */
public class CountGreaterValue {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,4,3,1};
        int k = 3;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
