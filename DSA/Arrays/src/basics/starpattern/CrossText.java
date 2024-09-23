package basics.starpattern;

public class CrossText {
    public static void main(String[] args) {
        String s = "WelcomeZohoCorporations";
        char ar[] = s.toCharArray();

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if( i == j) {
                    System.out.print(ar[i]);
                } else if( j == ar.length - (1 + i)) {
                    System.out.print(ar[j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
