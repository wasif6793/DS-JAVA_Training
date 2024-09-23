package dsaQuess;

import java.util.HashMap;

/*
Check for Anagrams (Easy)

Problem: Given two strings, determine if they are anagrams of each other using a HashMap.
Example:
Input: s = "listen", t = "silent"
Output: true
 */
public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));
}

    private static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for(char c : t.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0) return false;

            map.put(c, map.get(c)  -1);
        }

        return true;
    }


}
