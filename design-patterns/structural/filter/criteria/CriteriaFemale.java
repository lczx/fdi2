package criteria;

import java.util.List;
import java.util.stream.Collectors;

import people.Person;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(p -> p.getGender().equalsIgnoreCase("female")).collect(Collectors.toList());
    }

}
