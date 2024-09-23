package DSA.Arrays.src.dsaQues;

// Here we are going to find the largest element in the array
public class FindLargestElement {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,9,3,8,10};
        int num = arr[0];

        // Using for loop to find the largest element with using if statement
        for (int i = 1; i < arr.length; i++) {

            // comparing two elements of an array to find the bigger one
            if(num < arr[i]){
                num = arr[i];
            }
        }
        System.out.println(num);
    }


}
