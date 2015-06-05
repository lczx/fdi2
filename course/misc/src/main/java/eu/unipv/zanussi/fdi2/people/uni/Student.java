package eu.unipv.zanussi.fdi2.people.uni;

import eu.unipv.zanussi.fdi2.people.Person;
import eu.unipv.zanussi.fdi2.utils.Date;

public class Student extends Person {

    private int studentId;

    public Student(String name, String surname, Date date, int studentId) {
        super(name, surname, date);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + " [" + studentId + "]";
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
