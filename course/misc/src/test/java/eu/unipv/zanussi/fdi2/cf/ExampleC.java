package eu.unipv.zanussi.fdi2.cf;

import java.util.Set;
import java.util.TreeSet;

public class ExampleC {

    public static void main(String[] args) {
        // With TreeSet, duplicated elements get deleted automatically.
        Set<String> stringsList = new TreeSet<>();

        stringsList.add("Ciao");
        stringsList.add("Mondo");
        stringsList.add("Casa");
        stringsList.add("Casa");
        stringsList.add("Casa");
        stringsList.add("Presto");
        stringsList.add("Voglio");
        stringsList.add("Voglio");
        stringsList.add("Voglio");
        stringsList.add("Voglio");
        stringsList.add("Tornare");
        stringsList.add("Cena");
        stringsList.add("Dormire");

        // Now also prof. explained this:
        for (String string : stringsList)
            System.out.println(string);
    }

}
