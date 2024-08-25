package DSA.Arrays.src.sorting;

/*
Sort an Array of Strings by Length

Problem: Use Insertion Sort to sort an array of strings based on their lengths.
Input: ["apple", "banana", "kiwi", "cherry"]
Output: ["kiwi", "apple", "cherry", "banana"]

 */

public class StringInsertionSort
{
    public static void main(String[] args) {

        String arr[] ={"apple", "banana", "kiwi", "cherry"}; //apple = 5

        int n = arr.length;

        for(int i = 1; i < n;i++){
            String key = arr[i];
            int keylength = key.length();
            int j = i - 1;
            while(j >= 0 && arr[j].length() > keylength){
                arr[j+1] = arr[j];
                j--;
                arr[j+1] = key;

            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
