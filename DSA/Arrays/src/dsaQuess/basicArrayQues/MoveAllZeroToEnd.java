package DSA.Arrays.src.dsaQues;

/*
Move All Zeros to the End
Problem: Move all zeros in the array to the end while maintaining the relative order of the non-zero elements.
Input: An array of integers.
Output: The modified array.
Example:
java
Copy code
Input: [0, 1, 0, 3, 12]
        [12, 1, 0, 3, 0]
Output: [1, 3, 12, 0, 0]
 */
public class MoveAllZeroToEnd {
    public static void main(String[] args) {

        int arr[] = {0,1,0,3,12};
        int n = arr.length -1;
        int count = 0;
        for (int i = 0; i < arr.length - count; i++) {

            if (arr[i] == 0) {
                arr[i] = arr[n];
                arr[n] = 0;
                n--;
                count++;
            }
        }
        for(int num : arr){
            System.out.print(num+ ",");
        }
    }
}
