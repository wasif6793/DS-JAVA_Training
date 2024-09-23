package DSA.LinkedList;


// we can use likedList to store different data

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample
{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // to add data
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        list.add(2,"zz");

        list.remove(0);

        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Aa");
        list1.add("Bb");
        list1.add("Cc");
        list1.add("Dd");
        list1.add("Ee");

        list1.add(2,"zz");
        list1.remove(0);

        System.out.println(list1);

        // print all data from linkedlist and arraylist

        for(String name : list){
            System.out.print(name+ " ");
        }
        System.out.println();

        for(String name : list1){
            System.out.print(name+ " ");
        }

        System.out.println();
        System.out.println();
        for(String name : list){
            if(name.equalsIgnoreCase("zz")){

                break;
            } else {
                System.out.print(name+ " ");
            }
        }
        System.out.println();

        for(String name : list){
            if(name.equalsIgnoreCase("D")){

                continue;
            } else{
                System.out.print(name+ " ");
            }
        }

        System.out.println();

        list.contains("zz");
        if(list.contains("zz")){

            System.out.println(" zz hai");
        }
        list1.clear();

        list.peekFirst();
        System.out.println(list.peekFirst());

        list.pop();
        System.out.println(list);

    }
}
