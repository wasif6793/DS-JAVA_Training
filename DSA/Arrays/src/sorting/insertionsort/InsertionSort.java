package DSA.Arrays.src.sorting.insertionsort;

public class InsertionSort {
    public static void main(String[] args) {

        int arr[] = {2,3,4,1,6,5,4};
        int n = arr.length;

        for (int i = 1; i < n - 1; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                arr[j + 1] = key;
            }

        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i]);
        }
    }
}
