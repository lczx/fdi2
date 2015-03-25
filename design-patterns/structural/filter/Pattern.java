import java.util.ArrayList;
import java.util.List;

import criteria.*;
import people.Person;

public class Pattern {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert",   "Male",  "Single"));
        persons.add(new Person(  "John",   "Male", "Married"));
        persons.add(new Person( "Laura", "Female", "Married"));
        persons.add(new Person( "Diana", "Female",  "Single"));
        persons.add(new Person(  "Mike",   "Male",  "Single"));
        persons.add(new Person( "Bobby",   "Male",  "Single"));

        Criteria male = new CriteriaMale(),
                 female = new CriteriaFemale(),
                 single = new CriteriaSingle(),
                 singleMale = new AndCriteria(single, male),
                 singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle or females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    private static void printPersons(List<Person> p) {
        p.forEach(System.out::println);
    }

}
