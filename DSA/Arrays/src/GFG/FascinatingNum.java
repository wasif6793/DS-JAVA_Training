package GFG;

import java.util.Arrays;

import static java.util.Arrays.sort;

/*
https://www.geeksforgeeks.org/problems/fascinating-number3751/1?page=1&category=Arrays&difficulty=Easy&sortBy=difficulty

Given a number n. Your task is to check whether it is fascinating or not.

Fascinating Number: A number with 3 or more digits is considered fascinating if,
 when it is multiplied by 2 and 3, and the resulting products are concatenated with the original number,
  the final sequence contains all the digits from 1 to 9 exactly once.

Note:  If a number is fascinating, return true. Otherwise, return false.

Examples:

Input: n = 192
Output: true
Explanation: After multiplication with 2 and 3, and concatenating with original number,
 number will become 192384576 which contains all digits from 1 to 9.
 */
public class FascinatingNum {
    public static void main(String[] args) {
        System.out.println(fascinating(192));
    }
    static boolean fascinating(long n) {

        long a = n;
        long b = n * 2;
        long c = n * 3;

        String s = "" + a + b + c;
        char[] ch1 = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] ch = s.toCharArray();

        Arrays.sort(ch);
        return ch == ch1;
    }
}
