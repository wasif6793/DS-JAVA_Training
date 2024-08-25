package basics;

public class DynamicArrrayImplementation {

    //Undelying static array
    private char[] arr;
    //Current numbers of elements in the array
    private int size;
    //Maximum number of elements the array can hold without resizing
    private int capacity;

    //Constructed dynamic array with the given iniitial capacity
    public DynamicArrrayImplementation(int capacity) {
        this.arr = new char[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    //Return the value at the given index in the dynamic array
    public char get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        } return arr[index];
    }

    public static void main(String[] args) {

    }
}
