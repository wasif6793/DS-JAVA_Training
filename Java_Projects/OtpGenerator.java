package Java_Projects;

import java.util.*;
public class OtpGenerator {

    public static void main(String[] args) {

        System.out.println("Your Generated otp is " +getotp());

    }
    // Creating method to get opt
    public static String getotp(){
        StringBuilder otpgenerator = new StringBuilder();

        SplittableRandom splittableRandom = new SplittableRandom();

        for (int i = 0; i < 6; i++) {

            int randnum = splittableRandom.nextInt(0,9);
            otpgenerator.append(randnum);

        }
        return otpgenerator.toString();
    }
}
