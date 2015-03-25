package criteria;

import java.util.List;

import people.Person;

public class OrCriteria implements Criteria {

    private Criteria criteria1, criteria2;

    public OrCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> items = criteria1.meetCriteria(persons);
        criteria2.meetCriteria(persons).stream().filter(p -> !items.contains(p)).forEach(items::add);
        return items;
    }

}
