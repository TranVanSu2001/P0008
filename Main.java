
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Character, Integer> mapCharacter = new HashMap<Character, Integer>();
        HashMap<String, Integer> mapString = new HashMap<String, Integer>();
        Manage manage = new Manage();
        String str = manage.getString();
        String[] listStr = manage.getLetter(str);

        manage.countCharacter(str, mapCharacter);
        manage.countLetter(listStr, mapString);

//        for (String c : mapString.keySet()) {
//            System.out.println(c + ":" + mapString.get(c));
//        }
//
//        for (Character c : mapCharacter.keySet()) {
//            System.out.println(c + ":" + mapCharacter.get(c));
//        }
        manage.displayCountLetter(mapString, mapCharacter);
    }
}
