package DSA.Arrays.src.searching.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {1,2,3,5,7,8,9};
        int n = arr.length;
        int target = 7;
        int left = 0, right = n-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(arr[mid] == target){
                System.out.print(mid);
                break;
            } else if (arr[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }
}
