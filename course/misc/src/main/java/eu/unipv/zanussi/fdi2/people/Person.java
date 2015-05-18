package eu.unipv.zanussi.fdi2.people;

import eu.unipv.zanussi.fdi2.utils.Date;

public class Person implements Comparable<Person> {

    private String name, surname;
    private Date date;

    public Person(String name, String surname, Date date) {
        this.name = name;
        this.surname = surname;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return name + ' ' + surname + ' ' + date;
    }

    @Override
    public int compareTo(Person other) { // notice how its name is the same as for strings...
        String surname_i = this.getSurname();
        String surname_j = other.getSurname();
        return surname_i.compareTo(surname_j); // ...here
    }

}
