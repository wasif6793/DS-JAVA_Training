package DSA.Arrays.src.dsaQuess;

//find index of largest element

public class IndexOfLargestElement {

    public static void main(String[] args) {
        int arr[] = {2,4,3,65,7,5};
        int max = arr[0];
        int num = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
                num = i;
            }

        }
        System.out.println(max + " " + num);
    }


}
