package Java_Projects;

import java.util.Scanner;
public class CurrencyConverterCalculator {

    private static double usdtoinr = 83.74;
    private static double inrtousd = 0.012;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("**** Currency Converter Made By M. Wasif ****");
            System.out.println("1. USD to INR ");
            System.out.println("2. INR to USD");
            System.out.println("3. Exit");
            System.out.print("Choose one option from above: ");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter USD value: ");
                    double usdAmount = sc.nextDouble();
                    double inrAmount =getUsdtoinr(usdAmount);
                    System.out.println("USD to INR Amount is " + inrAmount);
                    System.out.println("**********************************************");
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter INR value: ");
                    double inr = sc.nextDouble();
                    double usd = getInrtousd(inr);
                    System.out.println("USD to INR Amount is " + usd);
                    System.out.println("**********************************************");
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Exiting..");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("You typed Invalid Number...");
                    System.out.println("**********************************************");
                    System.out.println();
            }
        }




    }

    public static double getInrtousd(double inr) {return inrtousd * inr; }

    public static double getUsdtoinr(double usdAmount) {
        return usdtoinr * usdAmount;
    }
}
