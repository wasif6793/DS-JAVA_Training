package DSA.Arrays.src.dsaQues;

import java.util.Arrays;

/*
 Check for Anagram Strings
Problem: Check if two given strings are anagrams of each other.
Input: Two strings.
Output: A boolean indicating whether the strings are anagrams.
Example:
java
Copy code
Input: "listen", "silent"
Output: true
 */
public class AnagramString {
    public static void main(String[] args) {

        String a= "listen";
        String b= "silent";

        char[] char1 = a.toCharArray();
        char[] char2 = b.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1, char2)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
