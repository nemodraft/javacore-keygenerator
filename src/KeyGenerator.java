import java.util.ArrayList;
import java.util.Random;

public class KeyGenerator {

    public static void main(String[] args) {

        // Keys Array & Maximum Capacity Of Keys

        ArrayList<String> keys = new ArrayList<>();

        // Additional Key Generator Settings & Configuration
        String prefix = "Key";
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_";
        int keyslength = 10;
        boolean showkey = true;

        // Key Generator Mechanics

        StringBuilder key = new StringBuilder();
        key.ensureCapacity(20);

        Random random = new Random();

        for (int index = 0; index <= keyslength; index++) {

            int randomIndex = random.nextInt(characters.length());
            key.append(characters.charAt(randomIndex));

        }

        // Key Produce

        keys.add(prefix + key.toString());

        if (showkey) {

            System.out.print("Your keys are: " + keys.toString());

        }

    }

}