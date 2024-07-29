package Java_Projects;

import java.security.SecureRandom;
public class RandomPasswordGenerator {
    public static void main(String[] args) {

        System.out.println("Generated Password is '" + passwordGenerate()+ "'");
    }

    public static String passwordGenerate(){

        String chars = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890!@#$%^&*";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int randomind = random.nextInt(chars.length());

            sb.append(chars.charAt(randomind));
        }
        return sb.toString();
    }
}
