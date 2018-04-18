import java.lang.management.BufferPoolMXBean;
import java.util.*;

public class MapMain {
    public static void main(String... args){
        Map<String, Integer> phonebook = new TreeMap<>();  // sortiert
        // Map<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Micky Maus", 12345678);
        phonebook.put("Lupo", 0 );
        phonebook.put("Buck Rogers", 555666777);
        phonebook.put("Buck Rogers", 444555666);
        System.out.println(phonebook.get("Lupo"));
        System.out.println(phonebook.get("Eusebia"));

        System.out.println(phonebook.keySet()); // VIEW zeigt alle keys in der map
        Set<String> keys = phonebook.keySet(); // keyset liefert kein neues Objekt
        for(String key: keys){
            if(phonebook.get(key) == 12345678)
                System.out.println(key);
        }

        keys.remove("Lupo");
        System.out.println(keys);

        Collection<Integer> values = phonebook.values();
        for(Integer number: values){
            System.out.println(number);
        }

        Set<Map.Entry<String, Integer>> entries = phonebook.entrySet(); // .entrySet = alles
        for(Map.Entry<String, Integer> entry: entries){
            System.out.println(entry);
        }
    }
}
