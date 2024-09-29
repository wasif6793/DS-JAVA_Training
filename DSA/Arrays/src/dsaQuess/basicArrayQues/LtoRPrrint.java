package DSA.Arrays.src.dsaQuess;

import java.util.Scanner;

/*
Given a string S and two integers L and R. Print the characters in the range L to R of the string.
NOTE: Assume zero based indexing.

Example 1:

Input:
S = "cdbkdub"
L = 0 , R = 5
Output: "cdbkdu"
Explanation: Starting from index 0 ('c')
to index 5 ('u').
 */
public class LtoRPrrint {
    public static void main(String[] args) {
        ltorPrinting();
        Scanner sc = new Scanner(System.in);



    }

    private static void ltorPrinting() {
        int l = 2;
        int r = 5;

        String s = "abcdefghijkl";
        String v = "";

        char c[] = s.toCharArray();

        for (int i = l; i <= r; i++) {
            v = v + c[i];

        }
        System.out.println(v);

    }
}
