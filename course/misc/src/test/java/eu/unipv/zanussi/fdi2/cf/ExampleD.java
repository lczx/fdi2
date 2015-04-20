package eu.unipv.zanussi.fdi2.cf;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ExampleD {

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("Ciao", "Hello");
        dictionary.put("Mondo", "World");
        dictionary.put("Casa", "Home");
        dictionary.put("Cena", "Dinner");
        dictionary.put("Letto", "Bed");

        Set<String> keys = dictionary.keySet();

        // TreeSets are ordered... also TreeMaps do all of this automatically.
        Set<String> orderedKeys = new TreeSet<>();

        /*for (String string : keys) orderedKeys.add(string);*/ // BECOMES
        orderedKeys.addAll(keys);

        for (String key : orderedKeys) {
            String value = dictionary.get(key);
            System.out.println(key + " means " + value);
        }

        // ----- MY CODE -----
        System.out.println();
        for (String str : "Ciao Mondo".split(" "))
            System.out.println(dictionary.get(str) + ' ');
        System.out.println();
    }

}
