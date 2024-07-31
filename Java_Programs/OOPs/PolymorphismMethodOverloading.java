package Java_Programs.OOPs;

public class PolymorphismMethodOverloading {
    public static void main(String[] args) {
        add("I am"," Wasif");

        System.out.println();
    }

    static void add(int num1,int num2){

        System.out.println(num1 + num2);

    }

    static void add(double num1, double num2){

        System.out.println(num1 + num2);
    }

    static void add(String val1, String val2 ){

        System.out.println(val1 + val2);
    }
}
