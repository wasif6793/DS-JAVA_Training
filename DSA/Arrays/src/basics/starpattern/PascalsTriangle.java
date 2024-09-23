package basics.starpattern;

/*
Pascal’s Triangle
Problem: Print Pascal’s triangle.
Input: Number of rows n.
Output:
markdown
Copy code
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("o");
            }
            for (int j = 1; j <  2 ; j++) {
                System.out.print(j+ " ");
            }

            for(int j = 1; j >= i ;j--){
                System.out.print(i+ " ");
            }

            System.out.println();


        }
    }
}
