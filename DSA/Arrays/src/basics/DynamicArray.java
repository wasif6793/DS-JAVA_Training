package DSA.Arrays.src.basics;

import java.util.ArrayList;
import java.util.List;

//Creating Dynamic Array
public class DynamicArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); // Defining the value
        list.add("A"); // Insertion
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(0,"F"); // Insertion
        list.remove(3); //Deletion
        list.remove("D");
        System.out.println(list);
    }
}
