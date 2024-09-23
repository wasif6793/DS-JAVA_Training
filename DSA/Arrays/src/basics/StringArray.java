package DSA.Arrays.src.basics;

import java.util.ArrayList;

public class StringArray {
    public static void main(String[] args) {

        String arr[] = {"Wasif", "Zubair", "Ankit"};

        ArrayList<String> list = new ArrayList<>();

        list.add("Wasif");
        list.add("Zubair");
        list.add("Ankit");

        list.toArray(arr);

        System.out.println(list);

        int n = arr.length ;

        for (int i = 0; i < n/2; i++) {
            String temp = arr[i];
            arr[i] = arr[n - 1 - i];   //9-1-1 = 7
            arr[n - 1 - i] = temp;

        }

        for(String num : arr){
            System.out.print(num+" ");
        }

        System.out.println();

        for (int i = arr.length; i >= 0  ; i--) {
            for(String v : arr){
                System.out.print(v+" ");
            }

        }
    }
}
