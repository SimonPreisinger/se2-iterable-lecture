import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class ArrayView {
    public static void main(String... args){
        List<String> strings = Arrays.asList(args);
        /*
        strings = new ArrayList<>(strings);
        for(ListIterator<String> li = strings.listIterator(); li.hasNext();){
            System.out.println(li.next());
            //strings.add("blah");
            strings.remove("blah"); // blah ist nicht im array drum kein Fehler
            //strings.remove(("Sim")); // erzeugt Fehler weil Sim in args enthalten
            strings.set(1, "xxxx");
            System.out.println(strings);
            System.out.println(Arrays.toString(args)); // orginal enthält sala
        }
        */

        Map<String, Integer> argsToLength = new TreeMap<>(); // oder new HashMap
        for(String arg: args){
            argsToLength.put(arg, arg.length());
        }
        System.out.println(argsToLength);

        Set<String> keys =  argsToLength.keySet();
        System.out.println(keys);

        Collection<Integer> values = argsToLength.values();
        System.out.println(values);

        Set<Map.Entry<String, Integer>> entries = argsToLength.entrySet();
        System.out.println(entries);
        int shortCount = 0;
        for(Map.Entry<String, Integer> entry: entries){
            if(entry.getValue() < 5)
                shortCount++;
           System.out.printf("key = %s, value = %s%n", entry.getKey(), entry.getValue());
        }
        System.out.println(shortCount);

    }
}
