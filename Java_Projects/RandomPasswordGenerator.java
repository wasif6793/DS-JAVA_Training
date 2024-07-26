package Java_Projects;

import java.security.SecureRandom;
public class RandomPasswordGenerator {
    public static void main(String[] args) {

      int length = 8;
        System.out.println("Generated Password is '" + passwordGenerate(length)+ "'");

    }

    public static String passwordGenerate(int length){

        String chars = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890!@#$%^&*";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomind = random.nextInt(chars.length());

            sb.append(chars.charAt(randomind));

        }
        return sb.toString();

    }
}
