package Java_Programs.Arrayss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList<String> arraylistwa = new ArrayList<>();
        arraylistwa.add("Wasif");
        arraylistwa.add("Rohit");
        arraylistwa.add("Amjad");

        System.out.println(arraylistwa);

        System.out.println(arraylistwa.get(1));
        System.out.println();

        for (String name : arraylistwa){
            System.out.println(name);
        }
        //Collection.sort(arraylistwa);
        // sorting

    }
}
