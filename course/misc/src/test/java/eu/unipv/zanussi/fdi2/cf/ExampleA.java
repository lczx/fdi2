package eu.unipv.zanussi.fdi2.cf;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExampleA {

    public static void main(String[] args) {
        // List<String> stringsList = new ArrayList<>(); // Is this better?
        List<String> stringsList = new LinkedList<>();

        stringsList.add("Ciao");
        stringsList.add("Mondo");
        stringsList.add("Casa");
        stringsList.add("Presto");
        stringsList.add("Voglio");
        stringsList.add("Tornare");
        stringsList.add("Cena");
        stringsList.add("Dormire");

        Iterator<String> iterator = stringsList.iterator();

        // Case #1
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }

        // Case #2
        // Now also prof. explained this:
        for (String string : stringsList)
            System.out.println(string);

        // Case #3
        for (int i = 0; i < stringsList.size(); i++)
            System.out.println(stringsList.get(i));
    }

}
