package Java_Programs.OOPs;

public class InheritanceProgram extends Calc{

    public static void main(String[] args) {

        int result = add(4,2);
        int resultsub = sub(4,2);
        int resultdiv = div(4,2);
        int resultmul = mul(4,2);

        System.out.println("Result using division: " + resultdiv);
        System.out.println("Result using Adding: " + result);
        System.out.println("Result using Subtracting: " + resultsub);
        System.out.println("Result using Multiplying: " + resultmul);

    }
}

class Calc{

    static int add(int i, int j){
        return i + j;

    }

    static int sub(int i, int j){
        return i - j;

    }

    static int div(int i, int j){

        return i / j;
    }

    static int mul(int i, int j){
        return i * j;

    }

    public class Minuss{


    }


}
