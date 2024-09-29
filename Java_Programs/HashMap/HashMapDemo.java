package Java_Programs.HashMap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"Wasif");
        map.put(2,"Rohit");
        map.put(3,"Tushar");
        map.put(4,"Harsh");
        map.put(5,"abc");
        map.put(2,"***8***");

        System.out.println();
        System.out.println(map.get(2));
        System.out.println();
        System.out.println(map);
        System.out.println();

        for(String i : map.values()){
            System.out.println(i);
        }
        System.out.println();

        HashMap<String,Integer> name = new HashMap<>();
        String names[] = {"Wasif","Rohit","Tushar"};
        int i[] = {1,2,3,4,5};


    }
}
