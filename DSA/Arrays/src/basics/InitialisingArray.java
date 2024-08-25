package basics;

public class InitialisingArray {
    public static void main(String[] args) {
        String[] names = new String[10];
        names[0] = "John";
        names[1] = "Jane";
        names[2] = " Doe";
        names[3] = "Jack";

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+", ");
        }
    }
}
