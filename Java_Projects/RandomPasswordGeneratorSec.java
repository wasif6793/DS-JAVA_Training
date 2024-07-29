package Java_Projects;

import java.util.Random;
public class RandomPasswordGeneratorSec {

    public static void main(String[] args) {
        System.out.println(passwordgen());


    }

    static String passwordgen(){

        String uppercase = "QWERTYUIOPASDFGHJKLZMXNCBV";
        String lowercase = "qwertyuipokasjdhfgzmxnbcvx";
        String num = "1234567890";
        String spclchar = "!@#$%^&*()";

        String allchars = uppercase + lowercase + num + spclchar;

        Random rn = new Random();

        StringBuilder passgen = new StringBuilder();

        passgen.append(uppercase.charAt(rn.nextInt(uppercase.length())));

        StringBuilder nextpass = new StringBuilder();

        for (int i = 0; i < 7; i++) {

            int random = rn.nextInt(allchars.length());

            nextpass.append(allchars.charAt(random));

        }

        String finalPassword = passgen + nextpass.toString();



        return finalPassword;
    }
}
