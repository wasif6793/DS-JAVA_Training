package DSA.Arrays.src.dsaQues;

/*
Calculate the Average of Array Elements
Problem: Find the average value of all elements in the array.
Approach: Sum all the elements and divide by the number of elements in the array.
 */
public class AverageOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,6,4};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // sum = sum + arr[i];
        }
        double avg = sum / arr.length;

        System.out.println(avg);
    }
}
