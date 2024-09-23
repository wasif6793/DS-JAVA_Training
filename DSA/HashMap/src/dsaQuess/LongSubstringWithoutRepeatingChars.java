package dsaQuess;

/*
Find the Longest Substring Without Repeating Characters

Problem: Given a string, find the length of the longest substring without repeating characters using a HashMap.
Input: A string.
Output: The length of the longest substring.
Example:
java
Copy code
Input: "abcabcbb"
Output: 3  // "abc" is the longest substring
 */
public class LongSubstringWithoutRepeatingChars {
    public static void main(String[] args) {

        String s ="abcabcbb";
        int count = 0;

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < i; j++) {
                if (ch[i] != ch[j]) {
                    count++;

                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(ch[i]+",");
        }








    }
}
