package DSA.Arrays.src.dsaQues;

import java.util.ArrayList;

/*
Check for Palindrome
Problem: Check if a given string is a palindrome.
Input: A string.
Output: A boolean indicating whether the string is a palindrome.
Example:
java
Copy code
Input: "madam"
Output: true
 */
public class Palindrome {
    public static void main(String[] args) {

        String val = "Madam";
        val = val.toLowerCase();
        String rev = "";

        for (int i = val.length() - 1; i >= 0 ; i--) {
            rev = rev + val.charAt(i);

        }
        if (val.equals(rev)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
