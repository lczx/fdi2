package eu.unipv.zanussi.fdi2.people.uni;

import eu.unipv.zanussi.fdi2.people.People;
import eu.unipv.zanussi.fdi2.people.Person;
import eu.unipv.zanussi.fdi2.utils.Date;

public class PeopleTest {

    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Student("Marco", "Bianchi", new Date(1, 1, 2014), 0);
        persons[1] = new Student("Anna", "Rossi", new Date(1, 1, 2014), 1);
        persons[2] = new Student("Giovanni", "Verdi", new Date(1, 1, 2014), 2);
        persons[3] = new Teacher("Luca", "Neri", new Date(1, 1, 2014), "Analisi");
        persons[4] = new Teacher("Davide", "Bruni", new Date(1, 1, 2014), "Fisica");

        People people = new People();
        people.setPeople(persons);
        people.order();

        for (Person p : persons) System.out.println(p);
    }

}
