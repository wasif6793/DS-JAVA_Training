package dsaQuess;

/*
Given two strings S1 and S2 as input.
Your task is to concatenate two strings and then reverse the string. Finally print the reversed string.
Example 1:

Input: S1 = "Geeks" , S2 = "forGeeks"
Output: "skeeGrofskeeG"
Explanation: Concatenating S1 and S2 to
get "GeeksforGeeks" then reversing it to
"skeeGrofskeeG".
 */
public class ConcatRev {
    public static void main(String[] args) {

        System.out.println(conRevstr("Geeks","foGeeks"));

    }

    static String conRevstr(String S1, String S2) {

        String s3 = S1 +S2;

        String rev = "";

        for (int i =s3.length() - 1; i >=0; i--) {
            rev = rev + s3.charAt(i);

        }

        return rev;
    }
}
