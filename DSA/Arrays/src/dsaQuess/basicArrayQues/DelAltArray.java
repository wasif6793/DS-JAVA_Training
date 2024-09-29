package dsaQuess;

import java.util.ArrayList;

/*
Given a string s as input. Delete the characters at odd indices of the string. Return the final string after deletion of characters at odd indices.

Examples :

Input: s = "Geeks"
Output: "Ges"
Explanation: Deleted "e" at index 1 and "k" at index 3.
 */
public class DelAltArray {
    public static void main(String[] args) {

        System.out.println(delchar("Geeks"));
    }

    static String delchar(String s){

        char[] c  = s.toCharArray();
        ArrayList<String> ar = new ArrayList<>();

        for (int i = 0; i < c.length; i= i +2 ) {
            ar.add(String.valueOf(c[i]));

        }
        StringBuilder sb = new StringBuilder();

        for(String str : ar) {
            sb.append(str);
        }
        String v = sb.toString();

        return v;


    }
}

