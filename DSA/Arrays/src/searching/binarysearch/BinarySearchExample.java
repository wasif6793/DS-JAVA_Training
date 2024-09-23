package DSA.Arrays.src.searching.binarysearch;

public class BinarySearchExample {

    // Binary Search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) { // {2, 3, 4, 10, 40,45,54,56} target = 10
            int middle = left + (right - left) / 2; // Avoids overflow

            // Check if target is present at middle
            if (arr[middle] == target) {
                return middle;
            }

            // If target greater, ignore left half
            if (arr[middle] < target) {
                left = middle + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = middle - 1;
            }
        }

        // If the element is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
