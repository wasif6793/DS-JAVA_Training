public class PrintNaturalNum {

    public static void main(String[] args) {
        int num = 10;
        int n = 1;
        int m = 1;
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        // while loop

        while(n <= num){
            System.out.print(n +" ");
            sum = sum + n;
            n++;

        }
        System.out.println();
        System.out.println("sum using while " + sum);
        System.out.println();
        // do while

        do{

            System.out.print(m + " ");
            sum2 = sum2 + m;
            m++;

        }
        while( m <= num);

        System.out.println();
        System.out.println("sum using do while " + sum2);
        System.out.println();

        //ulta while

        while (num >= 1){
            System.out.print(num + " ");
            num--;
        }

        System.out.println();
        System.out.println();
        // for loop

        for(int i = 1; i<= 10; i++){
            System.out.print(i+ " ");
            sum3 = sum3 + i;

        }
        System.out.println();
        System.out.println("sum using for loop: " + sum3);


    }
}
