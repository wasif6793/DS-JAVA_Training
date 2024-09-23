package DSA.Arrays.src.sorting.insertionsort;

//Sort an Array in Descending Order
public class DescInsertionSort
{
    public static void main(String[] args) {
        int arr[] = { 2,3,4,1,2,9,6,3,6};
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i -1;
            while(j>=0 && arr[j] < key){
                arr[j + 1] = arr[j];
                j--;
                arr[j + 1] = key;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
    }
}
