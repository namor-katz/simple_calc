import java.util.ArrayList;
import java.util.HashMap;

// this is example dicts

public class MapTest {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>(); //create new dict
        map.put("One", "Один"); // insert one and
        map.put("Two", "Два");
        map.put("Three", "Три");
        System.out.println(map + "This is all dict!"); //print all dict

        System.out.println(map.entrySet() + " тоже типа весь словарь");
        System.out.println(map.keySet() + " это все Ключи");
        System.out.println(map.values() + " все значения");

        ArrayList<String> val = new ArrayList<>(map.values());
        System.out.println(val + " это, как я вижу, массив значений");

        ArrayList<HashMap.Entry> entries = new ArrayList<>(map.entrySet());
        System.out.println(entries + " Это хер знает что");
        System.out.println("тут щас будет фор");
        for (HashMap.Entry entry : entries) {
            System.out.println(entry.getKey());
        }

        ArrayList<String> keys = new ArrayList<>();
        keys.addAll(map.keySet());
        System.out.println(keys);
    }
}


