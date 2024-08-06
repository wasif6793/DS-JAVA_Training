package Java_Projects;

import java.util.Scanner;
import java.util.SortedMap;

public class CalculatorUsingConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type First number: ");
        int num01 = sc.nextInt();
        System.out.println();
        System.out.print("Type Second Number: ");
        int num02 = sc.nextInt();
        System.out.println();
        System.out.println(" Choose 1 for addition \n Choose 2 for subtraction \n Choose 3 for multiplication \n Choose 4 for division");
        int value = sc.nextInt();
        Calci cc =new Calci(num01,num02,value);

    }

}
class Calci{
    int num01, num02, value;

    public Calci(int num1,int num2,int result){
        this.num01 = num1;
        this.num02 = num2;
        this.value = result;

            switch (result){
                case 1:
                    System.out.println(num1 + num2);
                    break;

                case 2:
                    System.out.println(num1 - num2);
                    break;

                case 3:
                    System.out.println(num1 * num2);
                    break;

                case 4:
                    if(num2 == 0){
                        System.out.println("Not define");
                    } else {
                        result =  num1 / num2;
                        System.out.println("Answer: " + result);
                    }
                    break;

                default:
                    System.out.println("Not a valid operation.");
            }


        }
    }

