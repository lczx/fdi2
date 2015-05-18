package eu.unipv.zanussi.fdi2.people;

import java.util.Arrays;

/**
 * Utility class for the 'Person' class.
 */
public class People {

    private Person[] people;

    public void setPeople(Person[] people) {
        this.people = people;
    }

    /**
     * Now this function is in the right place, and not as 'static' or not inside the 'Person' class...
     */
    public void order() {
        Arrays.sort(people);
        /*for (int i = 0; i < people.length; i++) for (int j = i + 1; j < people.length; j++) {
            if (people[i].compareTo(people[j]) > 0) {
                Person tmp = people[i];
                people[i] = people[j];
                people[j] = tmp;
            }
        }*/
    }

}
