package eu.unipv.zanussi.fdi2.people.uni;

import eu.unipv.zanussi.fdi2.people.Person;
import eu.unipv.zanussi.fdi2.utils.Date;

public class Teacher extends Person {

    private String course;

    public Teacher(String name, String surname, Date date, String course) {
        super(name, surname, date);
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() + " <" + course + ">";
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
