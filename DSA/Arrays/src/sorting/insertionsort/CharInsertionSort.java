package DSA.Arrays.src.sorting.insertionsort;

/*
Sort an Array of Characters

Problem: Implement Insertion Sort to sort an array of characters in alphabetical order.
Input: ['d', 'a', 'c', 'b']
Output: ['a', 'b', 'c', 'd']
 */
public class CharInsertionSort {
    public static void main(String[] args) {
        char arr[] = {'d', 'a', 'c', 'b'};
        int n = arr.length;

        for (int i = 1; i < n; i++){
            char key = arr[i];
            int j = i -1;
            while(j>= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
                arr[j + 1] = key;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }





    }
}
