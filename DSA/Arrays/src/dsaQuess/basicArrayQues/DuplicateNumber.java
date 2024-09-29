package dsaQuess;

import java.util.ArrayList;

//Find the Duplicate Number in an Array
public class DuplicateNumber {

    public static void main(String[] args) {
        int arr[] = {1,2,33,4,5,6,6,7,8,8,0};

        // Assigning arraylist so that I can store duplicate data from the array
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    list.add(arr[i]);
                }
            }

        }
        System.out.println(list);
    }

}
