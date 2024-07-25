package Java_Projects;

import java.util.*;
public class OtpGenerator {

    public static void main(String[] args) {

        String otp = getotp();

        System.out.println("Your Generated otp is " +otp);

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
