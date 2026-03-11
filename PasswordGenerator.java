import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        Random random = new Random();
        String password = "";

        int length = 10;

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password += characters.charAt(index);
        }

        System.out.println("Generated Password: " + password);
    }
}