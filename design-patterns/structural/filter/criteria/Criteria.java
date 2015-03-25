package criteria;

import java.util.List;

import people.Person;

public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);

}
