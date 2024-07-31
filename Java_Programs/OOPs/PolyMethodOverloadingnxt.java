package Java_Programs.OOPs;



public class PolyMethodOverloadingnxt {
    public static void main(String[] args) {

        int result = value(5,6); // 4 Bytes for result, 8B for value method because of int i and int j, Total memory in this line  = 12B
        double result2 = value(5.3,54.3); // 8 Bytes for result2, 16B for value method
        String res = value("Boss"," man "); //

        System.out.println(res + result2 );
        System.out.println( result);
    }

    public static int value(int i, int j){

        return i + j;
    }

    public static double value(double i, double j){

        return i + j;

    }
    public static String value(String val1, String val2){

        return val1 + val2;
    }

}
