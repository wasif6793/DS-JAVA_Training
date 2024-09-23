package basics.starpattern;

/*
Floyd’s Triangle
Problem: Print Floyd’s triangle.
Input: Number of rows n.
Output:
Copy code
1
2 3
4 5 6
7 8 9 10
 */
public class FloydTriangle {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(n++ + " ");
            }
            System.out.println();

        }
    }
}
