package dsaQuess;

import java.util.Locale;

/*
. Count Vowels and Consonants in a String
Problem: Given a string, count the number of vowels and consonants in it.
Input: A string.
Output: The count of vowels and consonants.
Example:
java
Copy code
Input: "hello"
Output: Vowels = 2, Consonants = 3
 */
public class CountVowelConsonent {
    public static void main(String[] args) {

        String s = "Hello";
        s.toLowerCase(Locale.ROOT);

        char[] c = s.toCharArray();
        int vowelCount = 0;
        int consonentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowelCount++;
            } else{
                consonentCount++;
            }
        }
        System.out.println("Consonent: " + consonentCount);
        System.out.println("Vowel: "+vowelCount);

    }
}
