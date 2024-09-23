package DSA.Arrays.src.dsaQues;

import java.util.ArrayList;

/*
Find the First Non-Repeated Character in a String
Problem: Given a string, find the first character that does not repeat.
Input: A string.
Output: The first non-repeated character.
Example:
java
Copy code
Input: "swiss"
Output: "w"
 */
public class NonRepeatedChar {
    public static void main(String[] args) {
        
        String val = "swiss";
        String v = "";

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < val.length(); i++) {
            list.add(val.substring( i, i+ 1 ));
        }
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        list.remove(j);
                    }else{
                        v = list.get(j);
                        break;
                    }

                }
        }

        System.out.println(v);
    }
}
