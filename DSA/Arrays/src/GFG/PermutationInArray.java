package GFG;

public class PermutationInArray {

    public static void main(String[] args) {
        System.out.println(isPossible(19, new int[]{2, 1, 3},new int[]{7,8,9}));
      //  int n = str.length();
    }
    public static boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.


        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if(arr1[i] + arr2[j] != k) {
                    continue;
                }

            }
            return true;
            
        }
        
        
        return false;
    }
    private void permute(String str, int l, int r){
        if(l == r){
            System.out.println(str);
        }else {
            for(int i = l; i <= r; i++){
                str = swap(str, l, i);
                permute(str, l+1, r);
                str = swap(str, l, i);
            }
        }
    }

    public String swap(String a, int i, int j){
        char temp;
        char[] chars = a.toCharArray();
        temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);

    }
}
