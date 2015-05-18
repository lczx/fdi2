package eu.unipv.zanussi.fdi2.files.people;

import eu.unipv.zanussi.fdi2.files.utils.FileLoader;
import eu.unipv.zanussi.fdi2.people.Person;

import java.util.ArrayList;
import java.util.Collections;

public class PeopleFilesTest {

    // Should use resources with "people/input.txt" to get an InputStream instead.
    public static final String FILE_PATH = "course/misc/src/main/resources/people/input.txt";

    public static void main(String[] args) {
        ArrayList<Person> allPeople = new ArrayList<>();

        FileLoader fileLoader = new FileLoader(new PeopleBuilder(allPeople), FILE_PATH);
        fileLoader.loadFile();

        Collections.sort(allPeople);

        for (Person person : allPeople) System.out.println(person);
    }

}
