package eu.unipv.zanussi.fdi2.people;

import eu.unipv.zanussi.fdi2.utils.Date;

public class PeopleTest {

    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Marco",    "Bianchi", new Date(1, 1, 2014));
        persons[1] = new Person("Anna",     "Rossi", new Date(1, 1, 2014));
        persons[2] = new Person("Giovanni", "Verdi", new Date(1, 1, 2014));
        persons[3] = new Person("Luca",     "Neri", new Date(1, 1, 2014));
        persons[4] = new Person("Davide",   "Bruni", new Date(1, 1, 2014));

        People people = new People();
        people.setPeople(persons);
        people.order();

        //for (int i = 0; i < people.length; i++)
        //    System.out.printf("%s, %s\n", people[i].getName(), people[i].getSurname());
    }

}
