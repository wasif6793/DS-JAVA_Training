package DSA.Arrays.src.sorting;

/*
Sort a 2D Array Row-Wise

Problem: Given a 2D array, sort each row using Insertion Sort.
Input: [[3, 2, 1], [9, 8, 7], [6, 5, 4]]
Output: [[1, 2, 3], [7, 8, 9], [4, 5, 6]]
 */
public class TwoDInsertionSot {
    public static void main(String[] args) {
        int arr[][] = {{2,3,1,4},{4,3,3,1,7},{1,7,5,3,6}};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int key = arr[i][j];
                int k = j - 1;
                while (k >= 0 && arr[i][k] > key) {
                    arr[i][k + 1] = arr[i][k];
                    k--;
                    arr[i][k + 1] = key;
                }
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(arr[i][j]);
            }

        }
    }
}
