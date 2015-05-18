package eu.unipv.zanussi.fdi2.files.people;

import eu.unipv.zanussi.fdi2.files.utils.ILineLoader;
import eu.unipv.zanussi.fdi2.people.Person;
import eu.unipv.zanussi.fdi2.utils.Date;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class PeopleBuilder implements ILineLoader {

    private ArrayList<Person> allPeople;

    public PeopleBuilder(ArrayList<Person> allPeople) {
        this.allPeople = allPeople;
    }

    @Override
    public void loadLine(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line); // = (line, " ") // METHOD #1
        String name = tokenizer.nextToken();
        String surname = tokenizer.nextToken();
        String date = tokenizer.nextToken();

        String[] dateNumber = date.split("-"); // METHOD #2
        int day = Integer.parseInt(dateNumber[0]);
        int month = Integer.parseInt(dateNumber[1]);
        int year = Integer.parseInt(dateNumber[2]);

        Person p = new Person(name, surname, new Date(day, month, year));
        allPeople.add(p);
    }

}
