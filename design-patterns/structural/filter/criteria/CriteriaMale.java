package criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import people.Person;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        /* Old, nice Java syntax, for posterity.
        for (Person person : persons)
            if (person.getGender().equalsIgnoreCase("male")) malePersons.add(person);
        */

        // Java 8... not so nice, but allows immediate return.
        return persons.stream().filter(p -> p.getGender().equalsIgnoreCase("male"))
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
