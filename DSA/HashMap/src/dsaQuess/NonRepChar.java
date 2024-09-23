package dsaQuess;

import java.util.HashMap;

/*
Find the First Non-Repeating Character in a String (Easy)

Problem: Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.
Example:
Input: "leetcode"
Output: 0
Explanation: The first non-repeating character is 'l' at index 0.
 */
public class NonRepChar {
    public static void main(String[] args) {

        System.out.println(nonRepChars("LeetcodeL"));


    }

    public static int nonRepChars(String t) {

        String s = t.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for( char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))== 1) return i;
        }

        return -1;
    }
}
