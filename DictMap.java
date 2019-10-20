import java.util.*;

public class DictMap {
    static String[] latin = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static int[] arabic = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    //вернуть словарь лат: арабик
    public static Map latin_to_arabic() {
        Map<String, Integer> states = new HashMap<String, Integer>();
        for (int i = 0; i < latin.length; i++) {
            states.put(latin[i], arabic[i]);
            }
        return states;
        }
    
    //вернуть словарь арабик: лат
    public static Map arabic_to_latin() {
        Map<Integer, String> states2 = new HashMap<Integer, String>();
        for (int i = 0; i < latin.length; i++) {
            states2.put(arabic[i], latin[i]);
        }
        return states2;
        }

    public static void main(String[] args) {
        Map<String, Integer> states = latin_to_arabic();
        int first = states.get("V");
        System.out.println(first);
    }
}
//так. тут что то про безопасность. !! TODOS
