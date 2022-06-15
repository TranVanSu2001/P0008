
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Manage {

    final Scanner sc = new Scanner(System.in);

    public String getString() {

        while (true) {
            System.out.println("Enter your content: ");
            String result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println("Not empty");
                System.out.println("Enter your content: ");
                continue;
            }

            return result;
        }
    }

    public String[] getLetter(String str) {
        String[] listStr = str.split("\\s++");

        return listStr;
    }

    public void countCharacter(String str, HashMap<Character, Integer> hm) {
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (!Character.isSpace(character)) {
                if (!hm.containsKey(character)) {
                    hm.put(character, 1);
                } else {
                    hm.put(character, hm.get(character) + 1);
                }
            }
        }
    }

    public void countLetter(String[] listStr, HashMap<String, Integer> hm) {
        for (int i = 0; i < listStr.length; i++) {
            String s = listStr[i];
            if (!hm.containsKey(s)) {
                hm.put(s, 1);
            } else {
                hm.put(s, hm.get(s) + 1);
            }
        }
    }

    public void displayCountLetter(HashMap<String, Integer> mapString, HashMap<Character, Integer> mapCharacter) {

        System.out.println(mapString);
        System.out.println(mapCharacter);

    }

}
