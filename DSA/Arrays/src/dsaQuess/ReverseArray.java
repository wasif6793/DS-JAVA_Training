package DSA.Arrays.src.dsaQues;

// Here I am going to reverse the array
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4, 5, 6, 7, 8, 9};
        int n = arr.length;

        //we use for loop to reverse the array
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];   //9-1-1 = 7
            arr[n - 1 - i] = temp;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
