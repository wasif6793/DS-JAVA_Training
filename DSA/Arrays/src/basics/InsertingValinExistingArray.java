package DSA.Arrays.src.basics;

// Here i am going to insert the new value between the array
public class InsertingValinExistingArray {
    public static void main(String[] args) {
        String[] names = new String[10];
        names[0] = "John";
        names[1] = "Jane";
        names[2] = " Doe";
        names[3] = "Jack";
        int position = 2; //Postion where new value named Apple will be Insert.
        for (int i = names.length -1; i > position ; i--) { //right side value shifted

            names[i] = names[i-1];
        }
        names[position] = "Apple";

        for (int i = 0; i < names.length - 1 ; i++) {
            System.out.print(names[i] + ", ");
        }


    }
}
