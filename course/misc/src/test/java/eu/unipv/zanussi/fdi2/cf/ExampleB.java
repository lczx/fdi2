package eu.unipv.zanussi.fdi2.cf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleB {

    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();

        stringsList.add("Ciao");
        stringsList.add("Mondo");
        stringsList.add("Casa");
        stringsList.add("Presto");
        stringsList.add("Voglio");
        stringsList.add("Voglio");
        stringsList.add("Voglio");
        stringsList.add("Tornare");
        stringsList.add("Cena");
        stringsList.add("Dormire");

        Collections.sort(stringsList);

        // Now also prof. explained this:
        for (String string : stringsList)
            System.out.println(string);
    }

}
